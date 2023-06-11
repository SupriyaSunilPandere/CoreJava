package com.jsp.Polymorphism;
// Run Time Polymorphism
public class Car {
    String brand;
	String name;
	String color;
	double price;
	public Car(String brand, String name, String color, double price) {

		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return " [ " + brand +" " + name + "  " + color + "  " + price + " ] ";
		
	}
	
	
}
