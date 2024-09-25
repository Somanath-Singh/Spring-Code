package com.nt.comp;

public class SportsCar extends Car {

private String regno;
	
	public SportsCar(String regno) {
		System.out.println("SportsCar.SportsCar()::one param constructor");
		this.regno = regno;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving sports car");

	}

}
