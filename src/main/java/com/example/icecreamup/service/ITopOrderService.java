package com.example.icecreamup.service;

import com.example.icecreamup.dto.ProductDTO;
/* This is the Top Order interface .
 * 
 * 
 */
public interface ITopOrderService {

	/**Get Flavors from persistence layer.
	 * @param id an unique lookup
	 * @return a flavor with a matching id.
	 */
	ProductDTO fetchByProductId(int productId);

	void save(ProductDTO order) throws Exception;

	Iterable<ProductDTO> fetchTopOrders() throws Exception;
}

