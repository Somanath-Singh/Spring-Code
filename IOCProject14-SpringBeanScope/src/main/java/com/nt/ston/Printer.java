package com.nt.ston;

public class Printer {
	
	//static variable to hold object reference
	//when 1st time it create object it holds the address of the object then second time it give th already created object not create object 2nd time
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("printer::0-param constructor");
	}

	//static factory method
	public static Printer  getInstance() {
		//singleton logic
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		
		return INSTANCE;
		
	}
	
	//b.method
	public void print(String msg) {
		System.out.println(msg);
	}
}
