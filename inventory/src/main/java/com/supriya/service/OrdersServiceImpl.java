package com.supriya.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supriya.exception.OrderNotFoundException;
import com.supriya.model.Orders;
import com.supriya.repository.IOrdersRepository;

@Service
public class OrdersServiceImpl implements IOrdersService {
	
	
	@Autowired 
	private IOrdersRepository ordersRepository;

	@Override
	public String createOrder(Orders order) {
		
		ordersRepository.save(order);
		return "Succssfully order created";
	}

	@Override
	public Iterable<Orders> getAllOrders() {
		return ordersRepository.findAll();
	}

	@Override
	public Orders getOrderById(Long id) throws OrderNotFoundException {
		
		
		Optional<Orders> op=ordersRepository.findById(id);
	if(	op.isPresent())
	{
	return	op.get();
	}
	else
	{
		throw new OrderNotFoundException("Order not available with this Id");
		
	}
	}

}
