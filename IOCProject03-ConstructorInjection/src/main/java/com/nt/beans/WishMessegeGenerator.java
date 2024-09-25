//WishMessegeGenerator.java
package com.nt.beans;

import java.util.Date;

public class WishMessegeGenerator {

	//HAS-A property(supporting components)
	private Date date;

	/*public WishMessegeGenerator() {
		System.out.println("WishMessegeGenerator ::0-param constructor");
	}*/
	
	
	//parameter constructor
	//constructor injection
	public WishMessegeGenerator(Date date) {
		System.out.println("WishMessegeGenerator::1-param constructor");
		this.date = date;
	}
	//business method
	public String generateMessege(String user) {
		
		System.out.println("WishMessegeGenerator.generateMessege()");
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
