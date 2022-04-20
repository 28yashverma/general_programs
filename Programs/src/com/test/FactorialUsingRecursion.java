package com.test;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(fact(num));
	}

	static int fact(int num) {
		int result = 1;
		if (num == 0 || num == 1) {
			return result;
		}

		result = num * fact(num - 1);
		return result;
	}

}
