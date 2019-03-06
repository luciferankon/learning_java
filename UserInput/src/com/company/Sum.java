package com.company;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (scanner.hasNextInt()) {
			sum += scanner.nextInt();
			count++;
		}
		double average = (double) sum / count;
		System.out.println("SUM = " + sum + " Average = " + average);
	}
}
