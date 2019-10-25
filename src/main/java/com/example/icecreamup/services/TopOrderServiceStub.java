package com.example.icecreamup.services;

import org.springframework.stereotype.Component;

import com.example.icecreamup.dto.ProductDTO;

/* This is the Top Order Service Stub that implements  
 * the interface ITopOrderService and returns
 * the ProductDTO database for productId,
 * Order Count, and Flavor.
 */
@Component
public class TopOrderServiceStub implements ITopOrderService
{
	@Override
	public ProductDTO fetchById(int id) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId(50);
		productDTO.setOrderCount(100);
		productDTO.setProductName("Chocolate");
		return productDTO;
	}
	
	
}