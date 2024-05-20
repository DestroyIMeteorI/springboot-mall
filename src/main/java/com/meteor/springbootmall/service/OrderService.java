package com.meteor.springbootmall.service;

import com.meteor.springbootmall.dto.CreateOrderRequest;
import com.meteor.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
