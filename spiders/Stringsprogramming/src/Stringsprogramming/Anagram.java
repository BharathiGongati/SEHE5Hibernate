package Stringsprogramming;

public class Anagram {

	public static String Anagram(String s) {

		char[] arr = s.toCharArray();
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
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
		String s1 = "aabbc";
		String s2 = "caabbh";
		String a = Anagram(s1);
		String b = Anagram(s2);
		if (a.equals(b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

}
