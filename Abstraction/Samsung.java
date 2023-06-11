package com.jsp.Abstraction;

public class Samsung extends Mobile {

	@Override
	public void call() {
	System.out.println( " Samsung calling Feature is Working");	
		
	}

	@Override
	public void camera() {
		
		System.out.println(" Samsung Camera Feature is Working");
	}

	@Override
	public void internet() {
		System.out.println(" Samsung internet  is Present");
		
	}

	@Override
	public void gps() {
		System.out.println(" Samsung gps Feature is Working");
		
	}
}
