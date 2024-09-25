package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.WishMessegeGenerator2;

public class AutoWiredFieldInjectionTest2 {

	public static void main(String[] args) {

		//create ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext2.xml");

		//for @Component("wmg")
		//get Bean spring bean class object
		//WishMessegeGenerator2 generator=ctx.getBean("wmg",WishMessegeGenerator2.class);
		
		//for @Component
				//get Bean spring bean class object
				WishMessegeGenerator2 generator=ctx.getBean("wishMessegeGenerator2",WishMessegeGenerator2.class);
				
		//invoke the business logic
		String result=generator.generateMessege("Raja");
		System.out.println("Wish Messege ::"+result);
		
		//close the ioc container
		ctx.close();
		
	}//main

}
