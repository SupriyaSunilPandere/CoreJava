package com.jsp.Interface;

public class Child extends C implements A,B {

	@Override
	public void m2() {
		System.out.println("m2()  B method is overriden");
		
	}

	@Override
	public void m1() {
		System.out.println("m1()  A method is overriden");
		
		
	}

	@Override
	public void m3() {
		System.out.println("m3()  c method is overriden");
		
		
	}

}
