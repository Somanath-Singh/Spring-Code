package com.nt.beans;

public class Student {

	private String sname;
	private String clgname;
	private int age;
	private String qlfy;
	
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", clgname=" + clgname + ", age=" + age + ", qlfy=" + qlfy + "]";
	}
	
	
}
