package com.example.icecreamup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.icecreamup.dao.IProductDAO;
import com.example.icecreamup.dto.ProductDTO;

@Primary
@Component
public class TopOrderService implements ITopOrderService
{
	@Autowired
	IProductDAO productDAO;
	
	@Override
	public ProductDTO fetchByProductId(int productId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ProductDTO order) throws Exception
	{
		productDAO.save(order);
	}

	@Override
	public Iterable<ProductDTO> fetchTopOrders() throws Exception
	{
		return productDAO.fetchAll();
	}
}
