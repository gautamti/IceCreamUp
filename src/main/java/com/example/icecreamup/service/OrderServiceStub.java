package com.example.icecreamup.service;

import org.springframework.stereotype.Component;
import com.example.icecreamup.dto.OrderDTO;

@Component
public class OrderServiceStub implements IOrderService
{
	
	@Override
	public OrderDTO setOrderId(int orderId)
	{
		OrderDTO order = new OrderDTO();
		order.setOrderId(orderId);
		return order;
	}
	
	@Override
	public void save(OrderDTO order)
	{
		
	}

	@Override
	public Iterable<OrderDTO> fetchAllOrders() throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
}
