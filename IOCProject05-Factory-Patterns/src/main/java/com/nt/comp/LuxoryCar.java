package com.nt.comp;

public class LuxoryCar extends Car {

	private String regno;
	
	public LuxoryCar(String regno) {
		System.out.println("LuxoryCar.LuxoryCar()::one param constructor");
		this.regno = regno;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving  LuxoryCar car");

	}

}
