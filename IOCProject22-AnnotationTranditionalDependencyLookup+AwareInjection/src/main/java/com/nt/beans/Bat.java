package com.nt.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class Bat {
	
	
	public Bat() {
		System.out.println("Bat.Bat()::0-param constructor");
	}
	
	
	public int scoreRuns() {
		return new Random().nextInt(130);//it will create random no between 1 to 129 
	}

} 
