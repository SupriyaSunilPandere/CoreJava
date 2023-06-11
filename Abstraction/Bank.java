package com.jsp.Abstraction;

public abstract  class Bank {


	abstract public void payment();
	
	abstract public void tansfer();
	
	abstract public void checkStatement();
	
	public static void m1() {
		
		System.out.println("Concreate method");
	}
	
	
}
