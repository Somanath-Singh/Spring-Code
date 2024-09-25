package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class ProffestionalCustomer1 {

	public static void main(String[] args) {

		//get car obj using factory
				Car car =CarFactory.createCar("budget","TSRF5242");
				car.drive();
				System.out.println("================");

	}

}
