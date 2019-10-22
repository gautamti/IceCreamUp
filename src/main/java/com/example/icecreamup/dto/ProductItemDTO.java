package com.example.icecreamup.dto;

/**
 * Class used for Product Items.
 * Used for linking a product to ingredients and provides a quantity.
 * @author chaklahk
 */
public class ProductItemDTO
{
	private int productId;
	private int ingredientId;
	private int quantity;
	
	public int getProductId()
	{
		return productId;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public int getIngredientId()
	{
		return ingredientId;
	}
	
	public void setIngredientId(int ingredientId)
	{
		this.ingredientId = ingredientId;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
}
