package com.example.icecreamup.service;

import com.example.icecreamup.dto.ProductDTO;
/* This is the All Item interface .
 * It will be able to return all Items available
 */
public interface IAllItemService {

	/**Get Flavors from persistence layer.
	 * @param id an unique lookup
	 * @return a flavor with a matching id.
	 */
	ProductDTO fetchAll(int[] id);
}

