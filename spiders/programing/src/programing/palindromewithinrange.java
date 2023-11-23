package programing;
public class palindromewithinrange {
	public static void main(String[] args) {
		for(int j=1;j<=1000;j++) {
		int n=j;
		int temp=n;
		int rev=0;
		while(n!=0) {
			int last=n%10;
			rev=(rev*10)+last;
			n=n/10;
		}
		
		if(rev==temp) {
			System.out.println(temp);
		}
		}
		}

}
