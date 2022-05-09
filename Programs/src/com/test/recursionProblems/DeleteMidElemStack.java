package com.test.recursionProblems;

import java.util.Stack;

public class DeleteMidElemStack {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		int midElem = st.size() / 2 + 1;

		System.out.println(midElem);

		System.out.println("Stack before deleting mid Elem " + st);

		solve(st, midElem);

		System.out.println("Stack after deleting mid Elem " + st);

	}

	private static void solve(Stack<Integer> st, int mid) {
		if (st.size() < 1) {
			return;
		}

		if (mid == 1) {
			st.pop();
			return;
		}

		int tElem = st.lastElement();
		st.pop();
		solve(st, mid - 1);
		st.push(tElem);
	}

}
