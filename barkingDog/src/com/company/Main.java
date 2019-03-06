package com.company;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 8));
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (barking) {
			if (hourOfDay > 7 && hourOfDay < 23) {
				return false;
			}
			
			if (hourOfDay < 0 || hourOfDay > 23) {
				return false;
			}
			
			return true;
		}
		return false;
	}
}
