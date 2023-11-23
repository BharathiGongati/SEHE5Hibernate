package org.jsp;

public class Anagram {
	public static String isAnagram(String n) {
		char[] arr = n.toCharArray();
		for (int i = 0; i <= n.length() - 1; i++) {
			for (int j = i + 1; j <= n.length() - 1; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return new String(arr);

	}

	public static void main(String[] args) {
		String a = "listen";
		String b = "silent";
		String n1 = isAnagram(a);
		String n2 = isAnagram(b);
		if (n1.equals(n2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not a Anagram");
		}

	}

}
