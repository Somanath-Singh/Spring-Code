//WishMessegeGenerator.java
package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//configure the target class using annotations
@Component
//configure the target class using annotations
//@Component("wmg")

//@Scope("prototype") //no object creation pre-instantiation is done for singleton scope it is not done for prototype scope comment the WMG class related operation to see the output is object is created or not 
public class WishMessegeGenerator2 {

	//@Autowired do all configuration like 0-param constructor creation and setter injection
	@Autowired //field level injection
	
	//HAS-A property(supporting components)
	private Date date;
	

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
