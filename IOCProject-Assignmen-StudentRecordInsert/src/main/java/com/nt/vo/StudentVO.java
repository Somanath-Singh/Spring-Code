package com.nt.vo;

public class StudentVO {
	
	private String sid;
	private String sroll;
	private String m1;
	private String m2;
	private String m3;
	
	
	public StudentVO() {
		System.out.println("StudentVO.StudentVO()::0-param constructor");
	}
	
	
	public String getSid() {
		return sid;
	}
	public String getSroll() {
		return sroll;
	}
	public String getM1() {
		return m1;
	}
	public String getM2() {
		return m2;
	}
	public String getM3() {
		return m3;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public void setSroll(String sroll) {
		this.sroll = sroll;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	public void setM3(String m3) {
		this.m3 = m3;
	}
	
	
	
	
}
