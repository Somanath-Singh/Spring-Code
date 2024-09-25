package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessegeGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {

		//hold spring bean cfg file name and location
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/chgs/applicationContext.xml");
		//create IOC container(BeanFactor container)
		//XmlBeanFactory factory=new XmlBeanFactory(res);
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		
		
		//get target spring bean class object
		
		Object obj=factory.getBean("wmg");
		/*Object obj2=factory.getBean("wmg");
		//second time not create object it take the same object which is present in cache memory
		System.out.println(obj.hashCode()+"  "+obj2.hashCode());*/
		//typecasting
		WishMessegeGenerator generator=(WishMessegeGenerator)obj;
		//invoke the business logic
		String result=generator.generateMessege("Raja");
		System.out.println("Wish Messege ::"+result);
		
	}//main

}
