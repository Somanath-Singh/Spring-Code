package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Customer;
import com.nt.beans.Employee1;
import com.nt.beans.Student;


public class ConstructorVsSetterInjectionTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj
		Employee1 emp1=factory.getBean("emp1",Employee1.class);
		System.out.println(emp1);
		System.out.println("=======================");
		Employee1 emp2=factory.getBean("emp2",Employee1.class);
		System.out.println(emp2);
		System.out.println("=======================");
		Employee1 emp3=factory.getBean("emp3",Employee1.class);
		System.out.println(emp3);
		System.out.println("=======================");
		
		
		Student s1=factory.getBean("stud1",Student.class);
		System.out.println(s1);
		System.out.println("=======================");
		
		
		Customer cust=factory.getBean("cust1",Customer.class);
		System.out.println(cust);
		
		
	}

}
