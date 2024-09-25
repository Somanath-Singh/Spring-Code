package com.nt.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("ckt")
public class Cricketer {
	
	 //no HAS-A property of dependent class
	
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()::0-param constructor");
	}
	
	public void bolwing() {
		System.out.println("Cricketer is bolwing");
	}
	
	public void Batting() {
		
		System.out.println("Cricketer is batting");
		//create additional IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//perform dependency lookup method to get Dependent class object
		Bat bat=ctx.getBean("bat",Bat.class);//Dependency lookup code
		int score=bat.scoreRuns();
		System.out.println("Cricketer batting score is ::"+score);
		
	}
	
	public void fielding() {
		System.out.println("cricketer is fielding");
	}
	
	public void wicketKeeping() {
		System.out.println("Cricketer is keeping the wickets");
	}
	
	

}
