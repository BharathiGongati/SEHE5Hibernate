package org.jsp;

import java.util.Scanner;

public class Mul {
	public static void Mul() {// 2*1=2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
			return;
		} else {
			for (int i = 1; i <= 10; i++) {
				int a = n * i;
				System.out.println(n + "*" + i+"=" + a);
			}
		}
		
      Mul();
	}

	public static void main(String[] args) {
		
		Mul();
	}

}
