package com.test.recursionProblems;

public class PrintNNumbers {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(solve(number));
	}

	public static int solve(int num) {
		if (num == 0) {
			return 0;
		}
		System.out.print(num + ",");
		return solve(num - 1);
	}

}
