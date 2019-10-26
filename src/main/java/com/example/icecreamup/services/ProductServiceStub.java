package com.example.icecreamup.services;

import org.springframework.stereotype.Component;
import com.example.icecreamup.dto.ProductDTO;

/**
 * Stub class that implements the IProductService interface
 */
@Component
public class ProductServiceStub implements IProductService
{
	/**
	 * Returns the ProductDTO object
	 * by the orderId
	 */
	@Override
	public ProductDTO fetchById(int productId)
	{
		ProductDTO product = new ProductDTO();
		product.setProductId(productId);
		return product;
	}
	
	/**
	 * Saves new product records in the database
	 */
	@Override
	public void save(ProductDTO product)
	{
		
	}
}
