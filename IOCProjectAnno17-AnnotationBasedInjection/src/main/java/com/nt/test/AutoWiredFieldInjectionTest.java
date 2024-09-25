package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessegeGenerator;

public class AutoWiredFieldInjectionTest {

	public static void main(String[] args) {

		//create ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");

		//get Bean spring bean class object
		WishMessegeGenerator generator=ctx.getBean("wmg",WishMessegeGenerator.class);
		
		//invoke the business logic
		String result=generator.generateMessege("Raja");
		System.out.println("Wish Messege ::"+result);
		
		//close the ioc container
		ctx.close();
		
	}//main

}
