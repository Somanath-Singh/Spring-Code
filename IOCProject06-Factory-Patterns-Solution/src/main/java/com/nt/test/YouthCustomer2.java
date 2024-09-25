package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class YouthCustomer2 {

	public static void main(String[] args) {

		//get car obj using factory
		Car car =CarFactory.createCar("Sports","TSRF5242");
		car.drive();
		System.out.println("================");

	}

}
