package programing;

public class armstrong {
	public static void main(String[] args) {
		int n=407;
		int temp=n;
		int count=count(n);
		int sum=0;
		while(n!=0) {
			int last=n%10;
			sum=sum+power(last,count);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstong");
		}
		else {
			System.out.println("not armstrong");
		}
		
	}
	public static int count(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
		
	}
	public static int power(int m,int n) {
		int pow=1;
		for(int i=1;i<=n;i++) {
			pow=pow*m;
		}
		return pow;
		
	}

}
