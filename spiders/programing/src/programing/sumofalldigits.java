package programing;

public class sumofalldigits {
	public static void main(String[] args) {
		int n=1234;
		int sum=0;
		while(n!=0) {
			int last=n%10;
			sum=sum+last;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
