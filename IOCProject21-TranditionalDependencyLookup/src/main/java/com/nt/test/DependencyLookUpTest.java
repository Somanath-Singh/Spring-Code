package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class DependencyLookUpTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target class object
		 Cricketer player=ctx.getBean("ckr", Cricketer.class);
		 //invoke method
		 player.Batting();
		 player.bolwing();
		 player.fielding();
		 
		 //close the container
		 ctx.close();

	}

}
