package com.test;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, result = 0;

		for (int i = 0; i < 7; i++) {
			result = a + b;
			a = b;
			b = result;
		}

		System.out.println(result);
	}

}
