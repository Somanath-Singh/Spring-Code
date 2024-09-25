package com.nt.beans;

import java.util.Date;

public class VotingEligibilityCheck {
	
	private String name;
	private int age;
	private String addrs;
	private Date verifiedOn;
	
	//setter method for setter injection
	public void setName(String name) {
		System.out.println("VotingEligibilityCheck.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotingEligibilityCheck.setAge()");
		this.age = age;
	}
	public void setAddrs(String addrs) {
		System.out.println("VotingEligibilityCheck.setAddrs()");
		this.addrs = addrs;
	}
	
	//custome init method
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		//initialize left over properties
		verifiedOn=new Date();
		if(addrs==null)
			addrs="not provided";
			//validation logic
			
			if(name==null) 
				throw new IllegalArgumentException("Name is required");
			else if(age<=0 || age>=126)
					throw new IllegalArgumentException("persone age must be in the range of 1 to 125");
		
	}
	
	//b.method
	public String checkvotingCriteria() {
		//b.logic
		if(age<18)
			return "Mr./Miss./Mrs "+name+"(age) "+age+" belongs to "+addrs+" is not eligible for votion -->verified on ::"+verifiedOn;
		else
			return "Mr./Miss./Mrs "+name+"(age) "+age+" belongs to "+addrs+" is eligible for votion -->verified on ::"+verifiedOn;
		
	}
	
	public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		//nullify bean property
		name=null;
		age=0;
		addrs=null;
		verifiedOn=null;
		
	}

}
