package com.nt.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealTimeDiTest {

	public static void main(String[] args) {

		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get springBEan object ref
		MainController controller=factory.getBean("studentController" ,MainController.class);
		
		//read inputs as String values and store them into StudentVO class object
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Student Rollno ::");
				String roll=sc.next();
				System.out.println("Enter m1 mark ::");
				String m1=sc.next();
				System.out.println("Enter m2 mark ::");
				String m2=sc.next();
				System.out.println("Enter m3 mark ::");
				String m3=sc.next();

				//store the values into StudentVO class
				StudentVO vo=new StudentVO();
				vo.setSroll(roll);
				vo.setM1(m1);
				vo.setM2(m2);
				vo.setM3(m3);
				
				//invoke business method
				try {
					String result=controller.ProcessStudent(vo);
					System.out.println(result);
				}
				catch(Exception se) {
					se.printStackTrace();
				}

	}

}
