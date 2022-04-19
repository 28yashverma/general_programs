package com.test;

public class Factorial {

	public static void main(String[] args) {
		int number = 6, result = 1;

		for (int i = 1; i <= number; i++) {
			result = result * i;
		}

		System.out.println(result);
	}

}
