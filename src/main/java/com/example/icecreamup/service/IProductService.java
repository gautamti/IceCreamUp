package com.example.icecreamup.service;

import com.example.icecreamup.dto.ProductDTO;

public interface IProductService
{
	/**
	 * Get products from persistence layer
	 * Save products to persistence layer
	 * @param id a unique lookup
	 * @return a product with a matching id
	 */
	
	ProductDTO fetchById(int productId);

	void save(ProductDTO product);

}