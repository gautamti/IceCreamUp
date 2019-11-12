package com.example.icecreamup.service;

import com.example.icecreamup.dto.ProductDTO;
/* This is the Top Order interface .
 * This servicce will be used to create the list of top ordered items
 * It will return a ProductDTO object by the specified ID
 */
public interface ITopOrderService {

	/**Get Flavors from persistence layer.
	 * @param id an unique lookup
	 * @return a flavor with a matching id.
	 */
	ProductDTO fetchByProductId(int productId);
}

