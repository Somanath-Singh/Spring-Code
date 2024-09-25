package com.nt.comp;

public class Test {
	
	private int a=10;
	private String b="hello";
	
	
	
	private Test(int a, String b) {
		
		this.a = a;
		this.b = b;
	}



	private Test() {
		System.out.println("Test.Test():: 0 param constructor ");
	}



	//toString method shortcut key=alt+shift+s
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	 
	
	
	

}
