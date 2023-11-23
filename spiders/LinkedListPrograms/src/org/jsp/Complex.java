package org.jsp;

public class Complex {
	int a, b;

	public static void main(String[] args) {

		Complex c1 = new Complex(2, 3);
		Complex c2 = new Complex(4, 1);

	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int mul(int n3, int n4) {
		return n3 + n4;
	}

	public Complex(int x, int y) {
		this.a = x;
		this.b = y;

		int ab = this.add(a, b);
		System.out.println(ab);

		int ac = this.mul(a, b);
		System.out.println(ac);
	}

}
