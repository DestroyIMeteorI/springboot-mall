package com.meteor.springbootmall.service;

import com.meteor.springbootmall.dto.ProductRequest;
import com.meteor.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
