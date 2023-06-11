package com.jsp.Abstraction;

public class BankDriver {

	public static void main(String args[]) {
		
		Boi b=new Boi();
		b.payment();
		b.tansfer();
		b.checkStatement();
		
		System.out.println("===========================================================================================");
		
		Sbi s=new Sbi();
		s.payment();
		s.tansfer();
		s.checkStatement();
	}
}
