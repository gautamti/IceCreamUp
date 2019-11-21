package com.example.icecreamup.dao;

import com.example.icecreamup.dto.OrderDTO;

public interface IOrderDAO
{
	boolean save(OrderDTO orderDTO) throws Exception;
	Iterable<OrderDTO> fetchAll() throws Exception;
}
