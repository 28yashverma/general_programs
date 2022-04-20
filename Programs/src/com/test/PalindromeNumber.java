package com.test;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121, modifiedNum = 0, temp;
		temp = num;
		while (num != 0) {
			modifiedNum = (modifiedNum * 10 + num % 10);
			num = num / 10;
		}

		System.out.println(modifiedNum == temp ? "Is Palindrom" : "Not Palindrom");
	}

}
