package com.jsp.Inheritance;

public class AnimalDriver {

	public static void main (String args []) {
		
		Animal a=new Animal();
		a.drink();
		System.out.println("================================");
		
		Dog d=new Dog();
		d.bark();
		d.drink();
		System.out.println("================================");
		BabyDog b=new BabyDog();
		b.weep();
		b.bark();
		b.drink();
	}
}
