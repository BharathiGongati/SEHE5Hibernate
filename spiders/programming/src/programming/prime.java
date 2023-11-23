package programming;

public class prime {
	public static void main(String[] args) {
		int count=0;
		int n=7;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" "+"number is prime");
		}
		else {
			System.out.println(n+" "+" is not prime");
		}
	}

}
