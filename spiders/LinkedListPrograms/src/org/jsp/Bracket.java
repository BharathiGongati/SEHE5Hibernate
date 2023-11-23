package org.jsp;

public class Bracket {
	static int[] stack;
	static int top;

	public static void push(char ele) {
		top++;
		stack[top] = ele;
	}

	public static void pop() {
		top--;
	}

	public static void main(String[] args) {
		String s = "}";
		boolean flag = true;
		top = -1;
		stack = new int[s.length()];
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				push(c);
			} else if ((top != -1) && ((c == ')' && stack[top] == '(') || (c == '}' && stack[top] == '{')
					|| (c == ']' && stack[top] == '['))) {
				pop();
			} else {
				flag = false;
				break;
			}
		}
		if (top == -1 && flag == true) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balenced");
		}
	}

}
