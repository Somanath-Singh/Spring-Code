package com.nt.beans;

public class A {

	private B b;
	

	
	public A() {
		System.out.println("0-param constructor");
	}



	public void setB(B b) {
		System.out.println("SetB method");
		this.b = b;
	}



	public A(B b) {
		System.out.println("A:: 0-param constructor ");
		this.b = b;
	}



	@Override
	public String toString() {
		return "A [b=]";
	}
	
	
}
