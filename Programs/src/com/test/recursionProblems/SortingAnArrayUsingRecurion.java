package com.test.recursionProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAnArrayUsingRecurion {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 0, 2));
		sort(arr);
		
		System.out.println(arr);
	}

	private static void sort(List<Integer> arr) {

		int totalSize = arr.size();
		int lastElement = 0;

		if (arr.size() == 1) {
			return;
		}
		// Take out last element
		lastElement = arr.get(totalSize - 1);
		arr.remove(totalSize - 1);
		sort(arr);
		insert(arr, lastElement);

	}

	private static void insert(List<Integer> arr, int element) {
		if (arr.size() == 0 || arr.get(arr.size() - 1) <= element) {
			arr.add(element);
			return;
		}

		// Get last element
		int value = arr.get(arr.size() - 1);
		arr.remove(arr.size() - 1);
		insert(arr, element);
		arr.add(value);
	}

}
