package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.factory.CarFactory;

public class LuxoryCustomer1 {

	public static void main(String[] args) {

		//get car obj using factory
				Car car =CarFactory.createCar("luxory","TSRF5242");
				car.drive();
				System.out.println("================");

	}

}
