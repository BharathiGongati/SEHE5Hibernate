package org.jsp;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String n = "bbaraahja";
		int[] arr = new int[128];
		for (int i = 0; i <= n.length() - 1; i++) {
			char c = n.charAt(i);
			arr[c]++;
		}
		for (int j = 0; j <= arr.length - 1; j++) {
			if (arr[j] != 0) {
				char c1 = (char) j;
				System.out.println(c1 + "-> " + arr[j]);
			}
		}
	}

}
