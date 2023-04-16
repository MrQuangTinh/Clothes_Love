package com.OrderService.dto;

import java.math.BigDecimal;

public class ItemRequest {
    private String skuCode;
    private String name;
    private BigDecimal price;
    private Integer quantity;

    public ItemRequest() {
    }

    public ItemRequest(String skuCode, String name, BigDecimal price, Integer quantity) {
        this.skuCode = skuCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
