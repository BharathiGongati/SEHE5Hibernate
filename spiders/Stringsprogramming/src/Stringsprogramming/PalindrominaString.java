package Stringsprogramming;

public class PalindrominaString {
	public static boolean palindrome(String s) {
		String n = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			n = s.charAt(i) + n;
		}
		return s.equals(n) ? true : false;

	}

	public static void main(String[] args) {
		String a = "abbaaaaaaamadamjkkk";
		String max = "";
		for (int i = 0; i <= a.length() - 1; i++) {
			String s = "" + a.charAt(i);
			for (int j = i + 1; j <= a.length() - 1; j++) {
				s = s + a.charAt(j);
				if (palindrome(s)) {
					if (max.length() < s.length()) {
						max = s;
					}
				}

			}
		}
		System.out.println(max);
	}

}
