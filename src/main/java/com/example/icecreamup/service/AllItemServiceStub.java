package com.example.icecreamup.service;

import org.springframework.stereotype.Component;

import com.example.icecreamup.dto.ProductDTO;

/* This is the All Item Service Stub that implements  
 * the interface IAllItemService and returns all
 * the ProductDTO items
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