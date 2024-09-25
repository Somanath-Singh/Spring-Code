package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.DHL;
import com.nt.comp.Flipkart;

public class StartegyDPTest {

	public static void main(String[] args) {
		
		//create ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get target class obj
		Flipkart fpk=ctx.getBean("fpk",Flipkart.class);
		//invoke the business method
		String result=fpk.shopping(new String[] {"shirt","trouser","phone"},new float[] {2000f,3000f,78000f});
		System.out.println(result);
		
		System.out.println("====================================");
		DHL dhl=ctx.getBean("dhl",DHL.class);
		System.out.println(dhl);
		

	}

}
