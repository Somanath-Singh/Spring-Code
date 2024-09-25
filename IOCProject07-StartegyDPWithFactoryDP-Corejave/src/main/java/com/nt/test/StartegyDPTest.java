package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StartegyDPTest {

	public static void main(String[] args) {
		
		try {
			//get target class obj from factory
			Flipkart fpk=FlipkartFactory.createFlipkart("dtdc");
			//invoke the business method
			String result=fpk.shopping(new String[] {"shirt","trouser","phone"},new float[] {2000f,3000f,78000f});
			System.out.println(result);
		}
		catch(Exception se) {
			se.printStackTrace();
		}

	}

}
