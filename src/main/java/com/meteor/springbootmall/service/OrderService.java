package com.meteor.springbootmall.service;

import com.meteor.springbootmall.dto.CreateOrderRequest;
import com.meteor.springbootmall.dto.OrderQueryParams;
import com.meteor.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
