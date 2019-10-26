package com.example.icecreamup.services;

import com.example.icecreamup.dto.ProductDTO;

public interface IProductService
{

	/**
	 * Gets products from the persistence layer
	 * @param productId
	 * @return
	 */
	ProductDTO fetchById(int productId);

	/**
	 * Saves products to the persistence layer
	 * @param product
	 */
	void save(ProductDTO product);

}