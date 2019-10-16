package com.example.icecreamup.services;

import org.springframework.stereotype.Component;
import com.example.icecreamup.dto.ProductDTO;

@Component
public class ProductServiceStub implements IProductService
{
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
