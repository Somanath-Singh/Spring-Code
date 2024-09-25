package com.nt.dto;

public class StudentDTO {
	
	private Integer sid;
	private Long sroll;
	private Integer m1;
	private Integer m2;
	private Integer m3;
	
	
	
	
	public StudentDTO() {
		System.out.println("StudentDTO.StudentDTO()::0-param constructor");
	}
	
	
	public Integer getSid() {
		return sid;
	}
	public Long getSroll() {
		return sroll;
	}
	public Integer getM1() {
		return m1;
	}
	public Integer getM2() {
		return m2;
	}
	public Integer getM3() {
		return m3;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public void setSroll(Long sroll) {
		this.sroll = sroll;
	}
	public void setM1(Integer m1) {
		this.m1 = m1;
	}
	public void setM2(Integer m2) {
		this.m2 = m2;
	}
	public void setM3(Integer m3) {
		this.m3 = m3;
	}
	
	

}
