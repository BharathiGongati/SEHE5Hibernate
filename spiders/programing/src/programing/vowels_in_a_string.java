package programing;

public class vowels_in_a_string {
	public static void main(String[] args) {
		String a="bharathi";
		for(int i=0;i<=a.length()-1;i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+" "+"is vowel");
			}
		}
	}

}
