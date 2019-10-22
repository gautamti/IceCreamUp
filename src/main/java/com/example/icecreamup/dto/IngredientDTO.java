package com.example.icecreamup.dto;

/**
 * Class for Ingredients.
 * Describes an ingredient, its availability, and price.
 * @author chaklahk
 */
public class IngredientDTO
{
	private int ingredientId;
	private String ingredientName;
	private boolean isAvailable;
	private double price;
	
	public int getIngredientId()
	{
		return ingredientId;
	}
	
	public void setIngredientId(int ingredientId)
	{
		this.ingredientId = ingredientId;
	}
	
	public String getIngredientName()
	{
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName)
	{
		this.ingredientName = ingredientName;
	}
	
	public boolean isAvailable()
	{
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
}
