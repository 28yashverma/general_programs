package com.test.recursionProblems;

import java.util.Stack;

public class SortingStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(5);
		stack.add(0);
		stack.add(2);

		// 2 is on top of stack
		System.out.println("Before sort : " + stack);
		sort(stack);
		System.out.println("After sort : " + stack);
	}

	private static void sort(Stack<Integer> stack) {
		if (stack.size() == 1) {
			return;
		}

		int element = stack.lastElement();
		stack.pop();
		sort(stack);

		insert(stack, element);

	}

	private static void insert(Stack<Integer> stack, int element) {
		if (stack.size() == 0 || stack.lastElement() <= element) {
			stack.push(element);
			return;
		}

		int value = stack.lastElement();
		stack.pop();
		insert(stack, element);
		stack.push(value);

	}

}
