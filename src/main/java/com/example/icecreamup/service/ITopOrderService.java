package com.example.icecreamup.service;

import com.example.icecreamup.dto.ProductDTO;

public interface ITopOrderService {

	/**
	 * Get top orders from persistence layer
	 * @param id a unique lookup
	 * @return an order by matching productId
	 */
	
	ProductDTO fetchByProductId(int productId);

	void save(ProductDTO order) throws Exception;

	Iterable<ProductDTO> fetchTopOrders() throws Exception;
}

