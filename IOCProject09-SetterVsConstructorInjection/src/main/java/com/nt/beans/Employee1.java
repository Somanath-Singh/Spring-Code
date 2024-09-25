package com.nt.beans;

public class Employee1 {

	//all are mandatory to participaet
	private int eno;
	private String ename;
	private float billamt;
	
	
	public Employee1(int eno, String ename, float billamt) {
		System.out.println("Employee1.Employee1(::3-param constructor)");
		this.eno = eno;
		this.ename = ename;
		this.billamt = billamt;
	}
	
	public Employee1(int eno, String ename) {
		System.out.println("Employee1.Employee1(::2-param constructor)");
		this.eno = eno;
		this.ename = ename;
	}
	
	public Employee1(int eno, float billamt) {
		System.out.println("Employee1.Employee1(::3-param constructor)");
		this.eno = eno;
		this.billamt = billamt;
	}

	public Employee1(String ename) {
		System.out.println("Employee1.Employee1(::1-param constructor)");
		this.ename = ename;
	}
	
	public Employee1(int eno) {
		System.out.println("Employee1.Employee1(::1-param constructor)");
		this.eno = eno;
	}
	
	public Employee1(float billamt) {
		System.out.println("Employee1.Employee1(::1-param constructor)");
		this.billamt = billamt;
	}

	@Override
	public String toString() {
		return "Employee1 [eno=" + eno + ", ename=" + ename + ", billamt=" + billamt + "]";
	}
	
	
	
}
