package com.example.icecreamup.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.icecreamup.dto.ProductDTO;

/**
 * 
 * @author chaklahk
 */
@Component
public class ProductDAO implements IProductDAO {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public boolean save(ProductDTO productDTO) throws Exception
	{
		productRepository.save(productDTO);
		return false;
	}

	@Override
	public Iterable<ProductDTO> fetchAll() throws Exception
	{
		return productRepository.findAll();
	}
}
