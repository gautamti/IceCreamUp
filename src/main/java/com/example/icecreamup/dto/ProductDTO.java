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
 * Class for Products.
 * Contains information about the product and a list of the ingredients (ProductItem)
 * @author chaklahk
 */

@Entity
@Table(name="products")
public class ProductDTO 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="CONTAINER")
	private String container;
	@Column(name="ORDER_COUNT")
	private int orderCount;
	@Column(name="CREATION_DATE")
	private Date creationDate;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	
	public int getProductId()
	{
		return productId;
	}
	
	public String getContainer()
	{
		return container;
	}
	
	public int getOrderCount()
	{
		return orderCount;
	}
	
	public Date getCreationDate()
	{
		return creationDate;
	}
	
	public String getCreatedBy()
	{
		return createdBy;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public void setContainer(String container)
	{
		this.container = container;
	}
	
	public void setOrderCount(int orderCount)
	{
		this.orderCount = orderCount;
	}
	
	public void setCreationDate(Date creationDate)
	{
		this.creationDate = creationDate;
	}
	
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return productId + " " + orderCount + " " + productName;
	}


	
}
