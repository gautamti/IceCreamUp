package com.example.icecreamup.dao;

import com.example.icecreamup.dto.ProductDTO;

public interface IProductDAO {
	boolean save(ProductDTO productDTO) throws Exception;
	Iterable<ProductDTO> fetchAll() throws Exception;

}
