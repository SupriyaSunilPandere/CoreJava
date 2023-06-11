package com.jsp.Abstraction;

public class Apple extends  Mobile {

	@Override
	public void call() {
	System.out.println(" Apple calling Feature is Working");	
		
	}

	@Override
	public void camera() {
		
		System.out.println(" Apple Camera Feature is Working");
	}

	@Override
	public void internet() {
		System.out.println(" Apple internet  is Present");
		
	}

	@Override
	public void gps() {
		System.out.println(" Apple gps Feature is Working");
		
	}

	
}
