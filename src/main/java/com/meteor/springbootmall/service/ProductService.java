package com.meteor.springbootmall.service;

import com.meteor.springbootmall.constant.ProductCategory;
import com.meteor.springbootmall.dto.ProductRequest;
import com.meteor.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
