package com.example.icecreamup.service;

import com.example.icecreamup.dto.OrderDTO;

public interface IOrderService
{
	/**
	 * Get orders from persistence layer
	 * Save orders to persistence layer
	 * @param id a unique lookup
	 * @return an order with a matching id
	 */
	
	OrderDTO fetchById(int orderId) throws Exception;

	void save(OrderDTO order) throws Exception;

	Iterable<OrderDTO> fetchAllOrders() throws Exception;

}