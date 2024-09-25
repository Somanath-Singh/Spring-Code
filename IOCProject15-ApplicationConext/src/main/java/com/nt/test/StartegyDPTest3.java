package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StartegyDPTest3 {

	public static void main(String[] args) {
		
		                                                                                                                                         
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");
		
		//get target class obj
		Flipkart fpk=factory.getBean("fpk",Flipkart.class);
		//invoke the business method
		String result=fpk.shopping(new String[] {"shirt","trouser","phone"},new float[] {2000f,3000f,78000f});
		System.out.println(result);
		
		
	}

}
