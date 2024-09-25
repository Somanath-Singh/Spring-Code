package com.nt.comp;

public class BudgetCar extends Car {
	
	private String regno;
	
	

	public BudgetCar(String regno) {
		System.out.println("BudgetCar.BudgetCar()::one param constructor");
		this.regno = regno;
	}



	@Override
	public void drive() {
		System.out.println("Driving Budget car="+regno);

	}

}
