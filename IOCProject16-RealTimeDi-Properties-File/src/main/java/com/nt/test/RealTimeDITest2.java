package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest2 {

	public static void main(String[] args) {

		//create IOC container

		ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext1.xml");
		
		//get SpringBean class obj ref
		MainController controller=cxt.getBean("controller",MainController.class);
		
		//read inputs as String values and store them into EmployeeVO class object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name ::");
		String name=sc.next();
		System.out.println("Enter Employee Desg ::");
		String desg=sc.next();
		System.out.println("Enter Employee basicSalary ::");
		String basicSalary=sc.next();
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setDesg(desg);
		vo.setBasicsalary(basicSalary);
		//invoke business method
		try {
			String result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception se) {
			//se.printStackTrace();
			System.out.println("Inter Error ::"+se.getMessage());
		} 
		
	}//main

}//calss
