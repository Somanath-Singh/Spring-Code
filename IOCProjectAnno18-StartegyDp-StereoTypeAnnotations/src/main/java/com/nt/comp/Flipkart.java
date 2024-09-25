package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpk")
public final class Flipkart {

	//HAS-A property of the interface
	@Autowired
	//@Qualifier("dtdc") //hard coding is bad partice
	
	//@Qualifier(@Value("${choose.courier}")) //will not work bcz qualifier does not allow @Value
	
	/*@Value("${choose.courier}")
	private String cid;
	@Qualifier(cid) //we can pass bean as the variable name */
	
	@Qualifier("logistic")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()::0-param constructor");
	}

	//setter method is not required for @Autowired
//	//setter method for setter injection
//	public void setCourier(Courier courier) {
//		System.out.println("Flipkart.setCourier()");
//		this.courier = courier;
//	}
	
	
	public String shopping(String items[],float prices[]) {
		
		System.out.println(courier);
		//calculate billamt
		float billamt=0.0f;
		for(int i=0;i<items.length;i++) {
			billamt=billamt+prices[i];
		}
		//generate order id
		int oid=new Random().nextInt(1000000);
		
		//use Courier for shipping
		String status=courier.deliver(oid);
		String finalmsg=Arrays.toString(items)+" are purchsed with prices"+Arrays.toString(prices)+" the generated billamt is :"+billamt;
		
		return finalmsg+" :: "+status;
		
	}
	
	
	
	
}
