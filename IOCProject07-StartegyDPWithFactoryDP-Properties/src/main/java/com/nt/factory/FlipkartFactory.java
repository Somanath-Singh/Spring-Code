package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	private static Properties props;
	
	static {
		System.out.println("FlipkartFactory.Static block Execute()");
		try (
			//load properties file
			FileInputStream fis=new FileInputStream("src/main/java/com/nt/commons/info.properties");)
		{
			//load properties file content to java.util.Properties class obj
			props=new Properties();
			props.load(fis);
			
		}//try
		catch(Exception se) {
			se.printStackTrace();
		}
	}
	
	//static factory method supporting factory pattern
	public static Flipkart createFlipkart() throws Exception {
		
		//create the target class object
		Flipkart fpkt=new Flipkart();
		
		//load dependent class
		Class c=Class.forName(props.getProperty("dependent.comp"));
		//create object using reflection object
		Constructor cons[]=c.getDeclaredConstructors();
		//create object
		Courier courier=(Courier)cons[0].newInstance();
		//set the dependent class object to target class obj
		fpkt.setCourier(courier);
		
		return fpkt;
	}
	
}
