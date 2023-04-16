package com.OrderService.dto;

import java.util.List;

public class CustomerRequest {
    private String name;
    private Integer phone;
    private List<OrderRequest> orderRequestList;

    public CustomerRequest() {
    }

    public CustomerRequest(String name, Integer phone, List<OrderRequest> orderRequestList) {
        this.name = name;
        this.phone = phone;
        this.orderRequestList = orderRequestList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public List<OrderRequest> getOrderRequestList() {
        return orderRequestList;
    }

    public void setOrderRequestList(List<OrderRequest> orderRequestList) {
        this.orderRequestList = orderRequestList;
    }
}
