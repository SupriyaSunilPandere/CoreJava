package com.jsp.Encapsulation;

public class Pen {
	private String name;
	private String brand;
	private String color;
	private int price;
	
	
	public Pen(String name, String brand, String color, int price) {
		
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void printPenDetails() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
	

}
