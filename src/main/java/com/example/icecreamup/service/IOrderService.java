package com.example.icecreamup.service;

import com.example.icecreamup.dto.OrderDTO;

public interface IOrderService
{

	OrderDTO setOrderId(int orderId) throws Exception;

	void save(OrderDTO order) throws Exception;

	Iterable<OrderDTO> fetchAllOrders() throws Exception;

}