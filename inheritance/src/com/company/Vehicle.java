package com.company;

import java.util.Collections;

public class Vehicle {
	private String engine;
	private int max_speed;
	
	public Vehicle(String engine, int max_speed) {
		this.engine = engine;
		this.max_speed = max_speed;
	}
	
	public void service(){
		System.out.println("service");
	}
	
}
