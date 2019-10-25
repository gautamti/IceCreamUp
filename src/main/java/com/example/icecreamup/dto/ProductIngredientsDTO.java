package com.example.icecreamup.dto;

/**
 * Class used for Product Items.
 * Used for linking a product to ingredients and provides a quantity.
 * @author chaklahk
 */
public class ProductIngredientsDTO
{
	private int ingredientId;
	private int quantity;
	
	public int getIngredientId()
	{
		return ingredientId;
	}
	
	public void setIngredientId(int ingredientId)
	{
		this.ingredientId = ingredientId;
	}
	
	public int getIngredientQuantity()
	{
		return quantity;
	}
	
	public void setIngredientQuantity(int quantity)
	{
		this.quantity = quantity;
	}
}
