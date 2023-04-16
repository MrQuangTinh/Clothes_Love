package com.OrderService.services;

import com.OrderService.dto.CustomerRequest;

public interface OrderService {

    public void createNewOrder(CustomerRequest customerRequest);

}
