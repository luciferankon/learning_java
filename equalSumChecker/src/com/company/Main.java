package com.company;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1,1,1));
	}
	
	public static boolean hasEqualSum(int first, int second, int sum) {
		return first + second == sum;
	}
}
