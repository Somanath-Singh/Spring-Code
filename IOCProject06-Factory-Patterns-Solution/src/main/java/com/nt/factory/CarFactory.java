package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;

public class CarFactory {

	//factory having factory pattern logic(logic to create and return one of several related classes object)
	public static Car createCar(String type,String redgno) {
		
		if(type.equalsIgnoreCase("Sports")) 
			return new SportsCar(redgno);
		else if(type.equalsIgnoreCase("budget"))
			return new BudgetCar(redgno);
		else if(type.equalsIgnoreCase("luxory")) 
			return new LuxoryCar(redgno);
		else
				throw new IllegalArgumentException("Invalid Car Type");
	
	}
}
