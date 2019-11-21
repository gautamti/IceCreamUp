package com.example.icecreamup.service;

import org.springframework.stereotype.Component;

import com.example.icecreamup.dto.ProductDTO;

/** This is the Top Order Service Stub that implements  
 * the interface ITopOrderService and returns
 * the ProductDTO database for productId,
 * Order Count, and Flavor.
 */
@Component
public class TopOrderServiceStub implements ITopOrderService
{
	@Override
	public ProductDTO fetchByProductId(int productId) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId(productId);
		productDTO.setOrderCount(100);
		productDTO.setProductName("Chocolate");
		return productDTO;
	}

	@Override
	public Iterable<ProductDTO> fetchTopOrders() throws Exception {
		return null;
	}

	@Override
	public void save(ProductDTO order) throws Exception {
		
	}
}