package com.example.icecreamup.dto;

/**
 * Class for Order Items.
 * Used for linking an order to a product and providing a quantity.
 * @author chaklahk
 */
public class OrderItemDTO
{
	private int orderId;
	private int productId;
	private int quantity;
	private double unitPrice;
	
	public int getOrderId()
	{
		return orderId;
	}
	
	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}
	
	public int getProductId()
	{
		return productId;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public double getUnitPrice()
	{
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
}
