package com.jsp.Encapsulation;

public class CarDriver {
  public static void main(String args[]) {
	  
	  Car c= new Car("BMW","X5","Black",9500000);
	  c.setEngine(new Engine("335","2995"));
	  c.printCarDetails();
  }
}
