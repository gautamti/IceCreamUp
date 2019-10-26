package com.example.icecreamup.services;

import org.springframework.stereotype.Component;
import com.example.icecreamup.dto.OrderDTO;

/**
 * Stub class that implements the IOrderService interface
 */
@Component
public class OrderServiceStub implements IOrderService
{
	/**
	 * Returns OrderDTO object
	 * by the orderId
	 */
	@Override
	public OrderDTO fetchById(int orderId)
	{
		OrderDTO order = new OrderDTO();
		order.setOrderId(orderId);
		return order;
	}
	
	/**
	 * Saves new product orders in the database
	 */
	@Override
	public void save(OrderDTO order)
	{
		
	}
}
