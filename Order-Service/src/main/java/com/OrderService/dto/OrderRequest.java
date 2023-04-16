package com.OrderService.dto;

import java.io.Serializable;
import java.util.List;

public class OrderRequest implements Serializable {
    private String orderNumber;
    List<ItemRequest> itemRequestList;

    public OrderRequest() {
    }

    public OrderRequest(String orderNumber, List<ItemRequest> itemRequestList) {
        this.orderNumber = orderNumber;
        this.itemRequestList = itemRequestList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ItemRequest> getItemRequestList() {
        return itemRequestList;
    }

    public void setItemRequestList(List<ItemRequest> itemRequestList) {
        this.itemRequestList = itemRequestList;
    }
}
