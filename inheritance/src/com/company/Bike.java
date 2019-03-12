package com.company;

public class Bike extends Vehicle {
	private int wheels;
	
	public Bike(int wheels, String engine, int max_speed) {
		super(engine, max_speed);
		this.wheels = 2;
	}
	
	@Override
	public void service() {
		System.out.println("service of a bike");
	}
	
	public void changeGear() {
		System.out.println("change gear of a bike");
	}
	
	public void steer() {
		System.out.println("handling steer of a bike");
	}
}
