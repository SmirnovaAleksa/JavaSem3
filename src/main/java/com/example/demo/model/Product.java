package com.example.demo.model;

public class Product {
	//1. Mainīgie
	private String title;
	private String description;
	private int quantity;
	private float price;
	
	//2.1 Getters
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getPrice() {
		return price;
	}
	
	//2.2 Setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	//3. Konstruktori
	public Product() {}

	public Product(String title, String description, int quantity, float price) {
		this.title = title;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
}
