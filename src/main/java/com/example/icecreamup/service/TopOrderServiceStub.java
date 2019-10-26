package com.example.icecreamup.service;

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
		int testProductId = 50;
		int testOrderCount = 100;
		String testName = "Chocolate";

		productDTO.setProductId(testProductId);
		productDTO.setOrderCount(testOrderCount);
		productDTO.setProductName(testName);
		return productDTO;
	}
	
	
}
