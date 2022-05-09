package com.test.recursionProblems;

// This program determines how many subset of a string can be made using Recursion method
public class SubsetProblem {

	public static void main(String[] args) {

		// For this string 4 subsets can be made - [{}, {a}, {b}, {ab}]
		String str = "ab";

		System.out.println(solveSubset(str));
	}

	private static String solveSubset(String str) {

		String emptyString = "null";
		int count = 0;

		if (str.length() == 0) {
			return emptyString;
		} else {
			count = count + 1;
			return ("" + str.charAt(0)) + solveSubset(str.substring(count));
		}
	}

}
