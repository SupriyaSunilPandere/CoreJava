package com.jsp.Encapsulation;

public class Engine {

private	String cubic_capacity;
private	String horse_power;
	
	public Engine(String cubic_capacity, String horse_power) {
		
		this.cubic_capacity = cubic_capacity;
		this.horse_power = horse_power;
	}

	public String getCubic_capacity() {
		return cubic_capacity;
	}

	public void setCubic_capacity(String cubic_capacity) {
		this.cubic_capacity = cubic_capacity;
	}

	public String getHorse_power() {
		return horse_power;
	}

	public void setHorse_power(String horse_power) {
		this.horse_power = horse_power;
	}
	
	public void printEngineDetails() {
		System.out.println("Engine config....");
		System.out.println(cubic_capacity);
		System.out.println(horse_power);
	}
	
	
}
