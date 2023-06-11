package com.jsp.Encapsulation;

public class Mobile {

	private String brand;
	private String name;
	private String ram;
	private double price;
	private Sim1 sim1;
	private Sim2 sim2;
	
	public Mobile(String brand, String name, String ram, double price) {
		
		this.brand = brand;
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Sim1 getSim1() {
		return sim1;
	}

	public void setSim1(Sim1 sim1) {
		this.sim1 = sim1;
	}

	public Sim2 getSim2() {
		return sim2;
	}

	public void setSim2(Sim2 sim2) {
		this.sim2 = sim2;
	}
	public void printMobileDetails() {
		System.out.println("Mobile Details...");
		System.out.println(brand+ "is a brand");
		System.out.println(name + "is a name");
	    System.out.println(price + "is a price");
	    System.out.println(ram + "is ram");
	    
	    if(sim1!=null) {
	    
	    sim1.printSim1Details();
    }else {
    	System.out.println("sim1 is not inserted");
    }
	    if(sim2!=null) {
		    
		    sim2.printSim2Details();
	    }else {
	    	System.out.println("sim2 is not inserted");
	    }
	}
	
	
	
}
