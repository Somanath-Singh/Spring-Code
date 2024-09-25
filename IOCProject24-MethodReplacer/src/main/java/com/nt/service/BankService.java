package com.nt.service;

public class BankService {
	
	public double calcIntrestAmmount(double pamt, double rate,double time) {
		System.out.println("BankService.calcIntrestAmmount()");
		//calculate compound intrest amount
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}

}
