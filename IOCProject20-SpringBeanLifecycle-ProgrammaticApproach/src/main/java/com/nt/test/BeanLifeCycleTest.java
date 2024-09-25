 package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibilityCheck;
public class BeanLifeCycleTest {

	public static void main(String[] args) {

		//create ioc container
		ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get spring bean class object
		VotingEligibilityCheck voting=cxt.getBean("voting",VotingEligibilityCheck.class);
		//invoke b.method
		System.out.println(voting.checkvotingCriteria());
		
		//close the ioc container
		cxt.close();
	}

}

/*output
 * 
 * VotingEligibilityCheck.setName()
VotingEligibilityCheck.setAge()
VotingEligibilityCheck.setAddrs()
VotingEligibilityCheck.myInit()
Mr./Miss./Mrs Banty(age) 22 belongs to Jatani is eligible for votion -->verified on ::Thu Jan 25 22:02:04 IST 2024
VotingEligibilityCheck.myDestroy()
 * */
