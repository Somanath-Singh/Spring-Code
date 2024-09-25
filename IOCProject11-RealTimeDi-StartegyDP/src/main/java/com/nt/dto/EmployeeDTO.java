package com.nt.dto;

import java.io.Serializable;

//pass data from one project to another project through dto
//how does object become serializable
//when class become implements serializable

public class EmployeeDTO implements Serializable {
	
	private Integer eno;
	private String ename;
	private String desg;
	private Float basicsalary;
	
	
	public Integer getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getDesg() {
		return desg;
	}
	public Float getBasicsalary() {
		return basicsalary;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setBasicsalary(Float basicsalary) {
		this.basicsalary = basicsalary;
	}
	
	
	
	

}
