package com.jsp.Encapsulation;

public class Sim2 {
	

	private	String operator;
	private	long contact_number;
		
		
		public Sim2(String operator, long contact_number) {
			
			this.operator = operator;
			this.contact_number = contact_number;
		}


		public String getOperator() {
			return operator;
		}


		public void setOperator(String operator) {
			this.operator = operator;
		}


		public long getContact_number() {
			return contact_number;
		}


		public void setContact_number(long contact_number) {
			this.contact_number = contact_number;
		}
		public void printSim2Details() {
			System.out.println("Sim2 Config...");
			System.out.println( operator + "is a operator");
			System.out.println(contact_number + "is a contact number");
		}
		
	}


