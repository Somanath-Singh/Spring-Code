package com.nt.vo;

//in vo class all are is String only So all are String
//vo and bo class are never send project to project they are used in the same project so they are not implementing serializable interface

public class EmployeeVO {
	
	private String eno;
	private String ename;
	private String desg;
	private String basicsalary;
	
	
	public String getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getDesg() {
		return desg;
	}
	public String getBasicsalary() {
		return basicsalary;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setBasicsalary(String basicsalary) {
		this.basicsalary = basicsalary;
	}
	
	

}
