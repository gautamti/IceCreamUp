package com.example.icecreamup.service;

import org.springframework.stereotype.Component;
import com.example.icecreamup.dto.ProductDTO;

@Component
public class ProductServiceStub implements IProductService
{
	/**
	 * Get products from persistence layer
	 * Save products to persistence layer
	 * @param id a unique lookup
	 * @return a product with a matching id
	 */
	
	@Override
	public ProductDTO fetchById(int productId)
	{
		ProductDTO product = new ProductDTO();
		product.setProductId(productId);
		return product;
	}
	
	@Override
	public void save(ProductDTO product)
	{
		
	}
}
