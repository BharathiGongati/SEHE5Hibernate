package org.jsp;

public class primebetweentwonumbers {
	public static void main(String[] args) {

		int n = 10;
		int c = 0;
		for (int j = 1; j <= n; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}

			}

			if (count == 2) {
				System.out.println(j + " " + "prime");
				c++;
			}

		}
		System.out.println("======");
		System.out.println(c);

	}
}
