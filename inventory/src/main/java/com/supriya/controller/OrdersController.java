package com.supriya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.supriya.exception.OrderNotFoundException;
import com.supriya.model.Orders;
import com.supriya.model.User;
import com.supriya.service.IOrdersService;

import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/orders")
@Api(value = "Get all orders related information ", tags = "Get All orders")
public class OrdersController {

	
	
	@Autowired
	private IOrdersService orderService;

	@PostMapping(path = "/create")
	public @ResponseBody String createOrder(@RequestBody Orders order) {

		return orderService.createOrder(order);
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Orders> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@GetMapping(path = "/")
	public @ResponseBody Orders getOrderById(@RequestParam Long id) {
		try {
			return orderService.getOrderById(id);
		} catch (OrderNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
