package Stringsprogramming;

public class ArmStrong {
	private static int length(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n = n / 10;
		}

		return c;

	}

	public static int powersum(int last, int ex) {
		int mul = 1;
		for (int i = 1; i <= ex; i++) {
			mul = mul * last;

		}
		return mul;

	}

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int ex = length(n);
		int sum = 0;
		while (n != 0) {
			int base = n % 10;
			sum = sum + powersum(base, ex);
			n = n / 10;

		}
		System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");

	}

}
