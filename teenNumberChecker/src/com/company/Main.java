package com.company;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(hasTeen(12,100,11));
	}
	
	public static boolean hasTeen(int first, int second, int third) {
		return isTeen(first) || isTeen(second) || isTeen(third);
	}
	
	private static boolean isTeen(int age) {
		return age > 12 && age < 20;
	}
}
