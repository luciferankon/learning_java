package com.company;

public class Main {

    public static void main(String[] args) {
			Vehicle vehicle = new Vehicle("acb", 100);
			Car car = new Car(4, "abc", 70);
			Bike bike = new Bike(2, "x", 40);
			Ferrari ferrari = new Ferrari(4, "y", 60);
			
			vehicle.service();
			
			car.changeGear();
			car.steer();
			
			bike.changeGear();
			bike.service();
			bike.steer();
			
			ferrari.changeGear();
			ferrari.steer();
		}
}
