package com.example.icecreamup.service;

import com.example.icecreamup.dto.ProductDTO;

public interface IProductService
{

	ProductDTO fetchById(int productId);

	void save(ProductDTO product);

}