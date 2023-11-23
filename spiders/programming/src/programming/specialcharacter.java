package programming;

public class specialcharacter {
	public static void main(String[] args) {
		char c='&';
		if((c>='A' && c<='Z' )){
			System.out.println(c+" "+" is uppercase alphabets");
		}
		else if(c>='A' && c<='Z') {
			System.out.println(c+" "+"is lower case alphabets ");
		}
		else if(c>='0' && c<='9') {//character range 0 to 9
			System.out.println(c+" "+" is digit");
		}
		else {
			System.out.println(c +" "+"special character");
		}
	}

}
