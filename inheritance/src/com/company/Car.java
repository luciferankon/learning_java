package com.company;

public class Car extends Vehicle {
	private int wheels;
	
	public Car(int wheels, String engine, int max_speed) {
		super( engine, max_speed);
		this.wheels = 4;
	}
	
	public void changeGear() {
		System.out.println("change gear of a car");
	}
	
	public void steer() {
		System.out.println("Increase speed of a car");
	}
}
