package com.meteor.springbootmall.dao;

import com.meteor.springbootmall.dto.ProductQueryParams;
import com.meteor.springbootmall.dto.ProductRequest;
import com.meteor.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
