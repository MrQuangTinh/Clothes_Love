package com.ProductService.services;

import com.ProductService.dto.ProductRequest;
import com.ProductService.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
