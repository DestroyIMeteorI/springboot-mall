package com.meteor.springbootmall.dao;

import com.meteor.springbootmall.dto.ProductRequest;
import com.meteor.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
