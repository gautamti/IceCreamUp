package com.example.icecreamup.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.icecreamup.service.IProductService;

import com.example.icecreamup.dto.ProductDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductServiceTest
{
	@Autowired
	private IProductService productService;
	
	@Test
	public void test()
	{
		// Expected Value - Value to fetch
		int productId = 7;
		ProductDTO product = productService.fetchById(productId);
		
		// Actual Value - Value that was actually fetched
		int actualProductId = product.getProductId();
		
		// Test that provided order id is the same as the actual order id.
		assertEquals("The returned productId did not match the expected productId.", productId, actualProductId);
	}

}
