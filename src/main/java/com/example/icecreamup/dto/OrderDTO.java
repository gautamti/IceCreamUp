package com.example.icecreamup.dto;

import java.util.Date;
import java.util.List;

/**
 * Class for Orders.
 * Contains order information and a list of all products in the order.
 * @author chaklahk
 */
public class OrderDTO 
{
	private int orderId;
	private String companyOrderedBy;
	private String address;
	private String phoneNumber;
	private String email;
	private Date timeStamp;
	private String comments;
	private List<OrderItemDTO> orderItems;
	
	public int getOrderId() 
	{
		return orderId;
	}
	
	public String getOrderedBy() 
	{
		return companyOrderedBy;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
	public String getEmail() 
	{
		
		return email;
	}
	
	public Date getTimeStamp() 
	{
		return timeStamp;
	}
	
	public String getComments() 
	{
		return comments;
	}
	
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	
	public void setOrderedBy(String orderedBy) 
	{
		this.companyOrderedBy = orderedBy;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public void setTimeStamp(Date timeStamp) 
	{
		this.timeStamp = timeStamp;
	}
	
	public void setComments(String comments) 
	{
		this.comments = comments;
	}

	public List<OrderItemDTO> getOrderItems()
	{
		return orderItems;
	}

	public void setOrderItems(List<OrderItemDTO> orderItems)
	{
		this.orderItems = orderItems;
	}
}
