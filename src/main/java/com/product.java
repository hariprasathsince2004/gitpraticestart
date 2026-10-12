package com;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class product {
	
	@Override
	public String toString()
	{
		return " productname = "+productname +" category ="+category+" price = "+price+" rating = "+rating+" stock = "+stock;
	}
	@Id
	private int id ;
	private String productname;
	private String category;
	private Double price;
	private int rating;
	private int stock ;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setproductname(String productname)
	{
		this.productname = productname;
	}
	public  String getproductname()
	{
		return productname;
	}
	public void setcategory(String category)
	{
		this.category= category;
	}
	public String getcategory()
	{
		return category;
	}
	public void setprice(Double price)
	{
		this.price=price;
	}
	public Double getprice()
	{
		return price;
	}
	public void setrating(int rating)
	{
		this.rating = rating;
	}
	public int getrating()
	{
		return rating;
	}
	public void setstock(int stock)
	{
		this.stock=stock;
	}
	public int getstock()
	{
		return stock;
	}
   
}
