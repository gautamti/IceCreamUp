package com.example.icecreamup.dao;

import com.example.icecreamup.dto.OrderDTO;
/**
 * Connects Controller to OrderDTO
 * Throws Exceptions useful for logging if save() or fetchAll()fail 
 */
public interface IOrderDAO
{
	boolean save(OrderDTO orderDTO) throws Exception;
	Iterable<OrderDTO> fetchAll() throws Exception;
}
