package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessegeGenerator;
import com.nt.ston.Printer;

public class SprinBeanScopeTest1 {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		
		
		//get target spring bean class object
		Printer p1=factory.getBean("p1",Printer.class);
		Printer p2=factory.getBean("p1",Printer.class);
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		System.out.println("===============================");
		Printer p3=factory.getBean("p",Printer.class);
		Printer p4=factory.getBean("p",Printer.class);
		System.out.println(p3.hashCode()+"  "+p4.hashCode());
		
		
		
	}//main

}
