package com.company;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(isLeapYear(1904));
	}
	
	public static boolean isLeapYear(int year) {
		if (year > 0 && year < 9999) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) return true;
					return false;
				}
				return true;
			}
		}
		return false;
	}
}
