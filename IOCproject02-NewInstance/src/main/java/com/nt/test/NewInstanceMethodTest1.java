package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest1 {

	public static void main(String[] args)throws Exception {

		//Load classes
		Class c1=Class.forName(args[0]);
		
		//get al  constructors of loadedclass
		Constructor cons[]=c1.getDeclaredConstructors();
		//allow to access private constructor
		cons[1].setAccessible(true);
		//Dynamic object using 0-param constructor
		Object obj1=cons[1].newInstance();
		System.out.println(obj1);
		System.out.println("------------------");
		cons[0].setAccessible(true);
		//Dynamic object using 2-param constructor
		Object obj2=cons[0].newInstance(100,"India");
		System.out.println(obj2);
	}

}
