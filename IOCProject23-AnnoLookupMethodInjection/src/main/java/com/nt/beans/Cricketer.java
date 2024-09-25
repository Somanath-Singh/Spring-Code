package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("ckt")
public abstract class Cricketer{
	
	 //no HAS-A property of dependent class
	
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()::0-param constructor");
	}
	
	public void bolwing() {
		System.out.println("Cricketer is bolwing");
	}
	
	//abstract method of return type dependent class
	@Lookup
	public abstract Bat createBat(); //in this method will be  implemented in 
																//the inMemory proxy class of this class having
																//Dependency lookup logic
	
	public void Batting() {
		
		System.out.println("Cricketer is batting");
		//donot need additional ioc container
		Bat bat=createBat();
		//invoke method
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
