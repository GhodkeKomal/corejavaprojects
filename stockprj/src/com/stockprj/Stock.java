package com.stockprj;

public class Stock {

	private String name;
	private int quantity;
	private double price;
	public Stock() {
		super();
	
	}
	public Stock(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	
	}
	
	public void removeQuantity(int quantityToremove)
	{
	if(quantityToremove <=quantity) {
		quantity=quantityToremove;
	}else {
		System.out.println(" not enough quantity to remove");
	}
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	

}

