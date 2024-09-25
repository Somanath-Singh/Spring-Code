package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessegeGenerator;

public class SprinBeanScopeTest {

	public static void main(String[] args) {

		//hold spring bean cfg file name and location
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/chgs/applicationContext.xml");
		//create IOC container(BeanFactor container)
		//XmlBeanFactory factory=new XmlBeanFactory(res);
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		
		
		//get target spring bean class object
		
		WishMessegeGenerator generator1=factory.getBean("wmg", WishMessegeGenerator.class);
		WishMessegeGenerator generator2=factory.getBean("wmg", WishMessegeGenerator.class);
		System.out.println(generator1.hashCode()+"  "+generator2.hashCode());
		//invoke the business logic
		String result=generator1.generateMessege("Raja");
		System.out.println("Wish Messege ::"+result);
		
	}//main

}
