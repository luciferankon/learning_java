package com.company;

public class Ferrari extends  Car{
	
	public Ferrari(int wheels, String engine, int max_speed) {
		super(wheels, engine, max_speed);
	}
	
	@Override
	public void changeGear() {
		System.out.println("Change gear of a ferrari");
	}
	
	@Override
	public void steer() {
		System.out.println("handling steer of a ferrari");
	}
}
