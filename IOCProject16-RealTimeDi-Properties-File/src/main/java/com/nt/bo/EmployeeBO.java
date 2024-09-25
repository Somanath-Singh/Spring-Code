package com.nt.bo;

public class EmployeeBO {

	private Integer eno;// optional for insert use cases
	private String ename;
	private String desg;
	private Float basicsalary;
	private Float grosssalary;
	private Float netsalary;

	// getters and setters method
	// ctrl+shift+f -for formating code
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

	public Float getGrosssalary() {
		return grosssalary;
	}

	public Float getNetsalary() {
		return netsalary;
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

	public void setGrosssalary(Float grosssalary) {
		this.grosssalary = grosssalary;
	}

	public void setNetsalary(Float netsalary) {
		this.netsalary = netsalary;
	}

}
