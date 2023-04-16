package com.OrderService.services;

import com.OrderService.dto.CustomerRequest;
import com.OrderService.dto.ItemRequest;
import com.OrderService.dto.OrderRequest;
import com.OrderService.entities.Customer;
import com.OrderService.entities.Order;
import com.OrderService.entities.OrderLineItems;
import com.OrderService.repositories.CustomerRepository;
import com.OrderService.repositories.OrderLineItemsRepository;
import com.OrderService.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderServiceimpl implements OrderService{

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final OrderLineItemsRepository orderLineItemsRepository;

    @Override
    public void createNewOrder(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setPhone(customerRequest.getPhone());

        //Save vao Order
//        List<Order> orderList = customerRequest.getOrderRequestList().stream()
//                .map(x -> castToOrderEntity(x) ).collect(Collectors.toList());

        List<Order> orderList = customerRequest.getOrderRequestList().stream()
                .map(x -> {
                    var or = castToOrderEntity(x);

                    or.setOrderLineItemsList(customerRequest.getOrderRequestList().stream()
                            .flatMap(z-> z.getItemRequestList().stream()
                                    .map(y -> castToEntity(y)))
                            .collect(Collectors.toList()));

//                    orderRepository.save(or);
                    return or;
                }).collect(Collectors.toList());

        customer.setOrderList(orderList);
        customerRepository.save(customer);

//        //Save vafo Item
//        List<OrderLineItems> orderLineItemsList = customerRequest.getOrderRequestList().stream()
//                .flatMap(x-> x.getItemRequestList().stream()
//                        .map(y -> castToEntity(y)))
//                .collect(Collectors.toList());

    }

    private Order castToOrderEntity(OrderRequest request){
        Order order = new Order();
        order.setOrderNumber(request.getOrderNumber());
        return order;
    }

    private OrderLineItems castToEntity(ItemRequest request){
        OrderLineItems item = new OrderLineItems();
        item.setSkuCode(request.getSkuCode());
        item.setName(request.getName());
        item.setPrice(request.getPrice());
        item.setQuantity(request.getQuantity());
        return item;
    }
}
