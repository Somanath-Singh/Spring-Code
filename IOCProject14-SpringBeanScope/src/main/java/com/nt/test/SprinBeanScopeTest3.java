package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessegeGenerator;
import com.nt.ston.Printer;

public class SprinBeanScopeTest3 {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext2.xml");
		
		
		//get target spring bean class object
		
		//get target spring bean class object
		
//				WishMessegeGenerator generator1=factory.getBean("wmg", WishMessegeGenerator.class);
//				WishMessegeGenerator generator2=factory.getBean("wmg", WishMessegeGenerator.class);
//				System.out.println(generator1.hashCode()+"  "+generator2.hashCode());
				
		Printer p1=factory.getBean("p1",Printer.class);
		Printer p2=factory.getBean("p1",Printer.class);
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		System.out.println("===============================");
	
		
		
		
	}//main

}
