package com.jsp.Polymorphism;

public class ADriver {

	public static void main(String args[]) {
		
		A a=new A();
		a.m1();
		a.m1(10,200);
		System.out.println("=====================================");
		B b=new B();
		b.m1(200, 2000);
		b.m1();
		b.m1(56, 10);
		
		
	}
}
