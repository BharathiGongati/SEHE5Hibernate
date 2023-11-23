package programing;

public class sumoffirstlastdigit {
	public static void main(String[] args) {
		int n=5879;
	   int 	temp=n;
		int last=temp%10;
		
		while(n!=0) {
			
			if(n<=9) {
				int sum=last+n;
				System.out.println(sum);
			}
			n=n/10;
		}
		
	}

}
