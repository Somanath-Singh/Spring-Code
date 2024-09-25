package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StartegyDPTest {

	public static void main(String[] args) {
		
		                                                                                                                                             //src/main/java/com/nt/cfgs used as source folder
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//or
		//FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//repalce the above code with below code																			//bydefault scr/main/java is present in build path of the project
		//create ioc container
//		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target class obj
//		Flipkart fpk=ctx.getBean("fpk",Flipkart.class);
//		//invoke the business method
//		String result=fpk.shopping(new String[] {"shirt","trouser","phone"},new float[] {2000f,3000f,78000f});
//		System.out.println(result);
		
		//close the container
		ctx.close();
	}

}
