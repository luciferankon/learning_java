package com.company;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1234,-3.123));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
		String firstNumber = String.format("%.3f",number1);
		String secondNumber = String.format("%.3f",number2);
		return Double.parseDouble(firstNumber)==Double.parseDouble(secondNumber);
	}
}
