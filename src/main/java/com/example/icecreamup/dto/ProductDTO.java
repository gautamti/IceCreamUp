package com.example.icecreamup.dto;

import java.util.Date;
import java.util.List;

/**
 * Class for Products.
 * Contains information about the product and a list of the ingredients (ProductItem)
 * @author chaklahk
 */
public class ProductDTO 
{
	private int productId;
	private String container;
	private int orderCount;
	private Date creationDate;
	private String createdBy;
	private String productName;
	private List<ProductItemDTO> ingredientList; /** Changed the name of ProductItem to IngredientList */
	
	
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

	public List<ProductItemDTO> getIngredientList()
	{
		return productItems;
	}

	public void setIngredientList(List<ProductItemDTO> ingredientList)
	{
		this.ingredientList = ingredientList;
	}
	
}
