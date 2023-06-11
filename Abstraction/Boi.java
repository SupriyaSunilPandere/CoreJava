package com.jsp.Abstraction;

public class Boi extends Bank{

	@Override
	public void payment() {
	System.out.println("Payment");	
		
	}

	@Override
	public void tansfer() {
		System.out.println("Transfer");	
		
	}

	@Override
	public void checkStatement() {
		System.out.println("CheckStatement");	
		
	}
	

}
