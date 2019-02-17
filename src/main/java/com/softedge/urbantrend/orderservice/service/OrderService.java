package com.softedge.urbantrend.orderservice.service;

import java.util.List;

import com.softedge.urbantrend.orderservice.exception.OrderNotFoundException;
import com.softedge.urbantrend.orderservice.model.Order;

public interface OrderService {

	public Order placeNewOrder(Order order);

	public List<Order> findAllOrders();

	public Order findOrderById(String orderId) throws OrderNotFoundException;

	public Order changeOrderStatus(Order order);
}
