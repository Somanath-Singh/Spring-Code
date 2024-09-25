//WishMessegeGenerator.java
package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessegeGenerator {

	//@Autowired do all configuration like 0-param constructor creation and setter injection
	 //field level injection
	@Autowired
	@Qualifier("dt")
	//HAS-A property(supporting components)
	private Date date;
	
	@Autowired
	public WishMessegeGenerator(@Qualifier("dt1")Date date) {
		System.out.println("WishMessegeGenerator.WishMessegeGenerator()");
		this.date = date;
	}


	@Autowired
	@Qualifier("dt2")
	public void setDate(Date date) {
		System.out.println("WishMessegeGenerator.setDate()");
		this.date = date;
	}
	
	@Autowired
	@Qualifier("dt3")
	public void assign(Date date) {//this method signaturemust match with setter method signature
		System.out.println("WishMessegeGenerator.assign()");
		this.date=date;
	}


	//business method
	public String generateMessege(String user) {
		
		System.out.println("WishMessegeGenerator.generateMessege() "+date);
		//get current hour of the date
		int hour=date.getHours();//24 hours format(0-23)
		
		//generate the wish messege
		if(hour<12) {
			return "Good Morning::"+user;
		}
		else if(hour<16) {
			return "Good Afternoon::"+user;
		}
		else if(hour<20) {
			return "Good Evening::"+user;
		}
		else {
			return "Good Night::"+user;
		}
	}
}
