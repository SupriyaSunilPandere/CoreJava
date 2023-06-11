package com.jsp.Inheritance;

public class Driver {

	public static void main (String args[]) {
		
		Doctor d1=new Doctor();
		d1.doctorDetails();
		System.out.println("======================");
		Surgeon s=new Surgeon();
		s.doctorDetails();
		s.surgeonDetails();
	}
}
