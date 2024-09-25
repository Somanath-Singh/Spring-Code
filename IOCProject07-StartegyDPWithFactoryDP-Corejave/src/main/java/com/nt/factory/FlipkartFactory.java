package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	//static factory method supporting factory pattern
	public static Flipkart createFlipkart(String couriertype) {
		
		//create the target class object
		Flipkart fpkt=new Flipkart();
		Courier courier=null;
		
		//create dependent class object based on courier type
		if(couriertype.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(couriertype.equalsIgnoreCase("bDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courier type ");
		
		//set the dependent class object to target class obj
		fpkt.setCourier(courier);
		
		return fpkt;
	}
	
}
