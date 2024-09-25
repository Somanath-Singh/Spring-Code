package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {

		//ioc container create
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/applicationContext.xml");
		//get target class object/proxy class object
		BankService service=ctx.getBean("bankService" ,BankService.class);
		
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass()+"  "+Arrays.toString(service.getClass().getDeclaredMethods()));
		
		//invoke the method
		System.out.println("Intrest amount ::"+service.calcIntrestAmmount(100000,2,12));
		
		//close the conteiner
		ctx.close();

	}

}
