package com.jsp.Inheritance;

public class VehicleDriver {

	public static void main(String args[] ) {
		
		Car c=new Car();
		c.reverseGear();
		c.brand="BMW";
		c.color="Black";
		c.price=9500000;
		System.out.println(c.brand);
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println("===============================================================");
		
		Bike b=new Bike();
		b.kickStart();
		b.brand="Ninja";
		b.color="Red";
		b.price=500000;
		System.out.println(b.brand);
		System.out.println(b.color);
		System.out.println(b.price);
		
	}
}
