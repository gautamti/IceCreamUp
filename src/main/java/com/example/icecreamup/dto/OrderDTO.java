package com.example.icecreamup.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class for Orders.
 * Contains order information and a list of all products in the order.
 * @author chaklahk
 */
@Entity
@Table(name="orders")
public class OrderDTO 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private int orderId;
	@Column(name="ORDER_BY")
	private String orderedBy;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	@Column(name="EMAIL")
	private String email;
	@Column(name="TIMESTAMP")
	private Date timeStamp;
	@Column(name="COMMENTS")
	private String comments;
//	private List<OrderItemDTO> orderItems;
	
	public int getOrderId() 
	{
		return orderId;
	}
	
	public String getOrderedBy() 
	{
		return orderedBy;
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
		this.orderedBy = orderedBy;
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

//	public List<OrderItemDTO> getOrderItems()
//	{
//		return orderItems;
//	}
//
//	public void setOrderItems(List<OrderItemDTO> orderItems)
//	{
//		this.orderItems = orderItems;
//	}
	
	@Override
	public String toString()
	{
		return orderId + " - " + orderedBy + " - " + address + " - " + phoneNumber + " - " + email + " - " + timeStamp + " - " + comments;
	}
}
