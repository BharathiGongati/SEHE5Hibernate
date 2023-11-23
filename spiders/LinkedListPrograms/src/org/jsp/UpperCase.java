package org.jsp;

public class UpperCase {
	public static void main(String[] args) {
		String s = "Hi i am bharathi";
		String s1="";
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				s1=s1+"$";
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
