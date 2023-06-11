package com.jsp.Abstraction;

public class Motorola extends Mobile{

	@Override
	public void call() {
	System.out.println( "Motorola  calling Feature is Working");	
		
	}

	@Override
	public void camera() {
		
		System.out.println(" Motorola Camera Feature is Working");
	}

	@Override
	public void internet() {
		System.out.println(" Motorola internet  is Present");
		
	}

	@Override
	public void gps() {
		System.out.println(" Motorola gps Feature is Working");
		
	}
}


