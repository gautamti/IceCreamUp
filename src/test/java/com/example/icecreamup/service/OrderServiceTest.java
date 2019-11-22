package com.example.icecreamup.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.icecreamup.dto.OrderDTO;
import com.example.icecreamup.service.IOrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//In java putting an I infront of a class name makes a developer think that the class is an interface.
//This is not an interface thus there should be no I.
//Furthermore you should be testing all of the DTOs, DAOs and services
public class OrderServiceTest
{
	@Autowired
	private IOrderService orderService;
	
	
	@Test
	public void testFetchOrder() throws Exception
	{
		// Expected Value - Value to fetch
		int orderId = 7;
		OrderDTO order = orderService.fetchById(orderId);
		
		// Actual Value - Value that was actually fetched
		int actualOrderId = order.getOrderId();
		
		// Test that provided order id is the same as the actual order id.
		assertEquals("The returned orderId did not match the expected actualOrderId.", orderId, actualOrderId);
	}

}
