package com.OrderService.controller;

import com.OrderService.dto.CustomerRequest;
import com.OrderService.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
//@AllArgsConstructor
public class OrderController {
//    private final OrderService orderService;
    @Autowired
    private  OrderService orderService;

    @PostMapping
    public ResponseEntity<String> customerCreatOrder(@RequestBody CustomerRequest request){
        orderService.createNewOrder(request);
        return new ResponseEntity<>("Customer Order Success!", HttpStatus.CREATED);
    }

}
