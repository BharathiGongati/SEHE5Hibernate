package programing;

public class fibanacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=10;
		if(n==1) {
			System.out.println(a);
		}
		else if(n==2) {
			System.out.println(a+" "+b);
		}
		else {
			System.out.print(a+" "+b+" ");
			for(int i=3;i<=n;i++) {
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
		
	}

}
