package com.test;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		int num = 8;
		System.out.println(fibo(num));
	}

	static int fibo(int num) {
		if (num == 0) {
			return 0;
		}

		if (num == 1) {
			return 1;
		}
		return fibo(num - 1) + fibo(num - 2);
	}

}
