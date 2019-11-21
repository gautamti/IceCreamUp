package com.example.icecreamup.dao;

import com.example.icecreamup.dto.ProductDTO;
/**
 * Connects Controller to ProductDTO
 * Throws Exceptions useful for logging if save() or fetchAll() fail 
 */
public interface IProductDAO {
	boolean save(ProductDTO productDTO) throws Exception;
	Iterable<ProductDTO> fetchAll() throws Exception;

}
