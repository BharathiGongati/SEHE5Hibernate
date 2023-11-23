package consonants;

public class consonants {
	public static void main(String[] args) {
		String s="bharathi";
		String s1=s.toLowerCase();
		
		for(int i=0;i<=s1.length()-1;i++) {
			char a=s1.charAt(i);
			if(a=='a' || a=='e'||a=='i'||a=='o'||a=='u') {
		        System.out.println("Vowels present");
			}
			else {
				System.out.println("Vowels not present");
				}
			}
}
}
