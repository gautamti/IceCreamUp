package com.example.icecreamup.services;

import com.example.icecreamup.dto.OrderDTO;

public interface IOrderService
{

	/**
	 * Gets orders from the persistence layer
	 * @param orderId
	 * @return
	 */
	OrderDTO fetchById(int orderId);

	/**
	 * Saves orders to the persistence layer
	 * @param order
	 */
	void save(OrderDTO order);

}