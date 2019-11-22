package com.example.icecreamup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.icecreamup.dao.IOrderDAO;
import com.example.icecreamup.dto.OrderDTO;

@Primary
@Component
public class OrderSevice implements IOrderService
{
	@Autowired
	IOrderDAO orderDAO;
	
	@Override
	public OrderDTO setOrderId(int orderId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(OrderDTO order) throws Exception
	{
		orderDAO.save(order);
	}
	
	@Override
	public Iterable<OrderDTO> fetchAllOrders() throws Exception 
	{
		return orderDAO.fetchAll();
	}

}
