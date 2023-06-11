package com.jsp.Abstraction;

public class Driver {

	public static void main(String args []) {
		
		Apple a=new Apple();
		a.call();
		a.camera();
		a.gps();
		a.internet();
		
		System.out.println("=====================================================");
		
		Samsung s=new Samsung();
		s.call();
		s.camera();
		s.gps();
		s.internet();
		System.out.println("=====================================================");
		
		Motorola m=new Motorola();
		
		m.call();
		m.camera();
		m.gps();
		m.internet();
	}
}
