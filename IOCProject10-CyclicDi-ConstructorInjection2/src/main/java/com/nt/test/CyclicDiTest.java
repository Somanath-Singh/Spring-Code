package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDiTest {

	public static void main(String[] args) {

		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get spring bean class object(works)
		A oa=factory.getBean("a1",A.class);
		System.out.println(oa);
		
		//it throw  exception when we call first B class but after call A class it store the data into internal cache so second time it does't give exception
		B ob=factory.getBean("b1",B.class);//(throws exception)
		System.out.println(ob);
		
		
	}

}
