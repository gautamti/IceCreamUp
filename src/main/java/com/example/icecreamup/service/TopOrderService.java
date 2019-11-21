package com.example.icecreamup.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.icecreamup.dao.IProductDAO;
import com.example.icecreamup.dto.ProductDTO;

public class TopOrderService implements ITopOrderService {

	@Autowired
	IProductDAO productDAO;
	
	
	@Override
	public ProductDTO fetchByProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ProductDTO order) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<ProductDTO> fetchTopOrders() throws Exception {
		// TODO Auto-generated method stub
		return productDAO.fetchAll();
	}
}
