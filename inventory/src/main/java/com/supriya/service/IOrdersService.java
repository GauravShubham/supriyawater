package com.supriya.service;

import com.supriya.exception.OrderNotFoundException;
import com.supriya.model.Orders;

public interface IOrdersService {

	public String createOrder(Orders order);

	public Iterable<Orders> getAllOrders();

	public Orders getOrderById(Long id) throws OrderNotFoundException;

}
