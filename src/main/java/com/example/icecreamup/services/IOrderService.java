package com.example.icecreamup.services;

import com.example.icecreamup.dto.OrderDTO;

public interface IOrderService
{

	OrderDTO fetchById(int orderId);

	void save(OrderDTO order);

}