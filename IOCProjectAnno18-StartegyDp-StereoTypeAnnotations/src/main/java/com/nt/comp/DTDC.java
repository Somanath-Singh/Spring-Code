//dependent class
package com.nt.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//@Component("courier")//2
//or
@Component("dtdc")//1
//@Primary//1

//name and location of properties file
@PropertySource("com/nt/commons/info.properties")
public final class DTDC implements Courier {
	
	//read value from properties file and injecting to spring bean property we use @Value 
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${os.name}")
	private String os;
	@Value("${Path}")
	private String path;
	
	public DTDC() {
		System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+ " order id order delivered DTDC";
		
	}

	@Override
	public String toString() {
		return "DTDC [name=" + name + ", age=" + age + ", os=" + os + ", path=" + path + "]";
	}
	
	

}
