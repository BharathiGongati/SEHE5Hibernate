package Stringsprogramming;

public class fibonacci {
	static int a=0;
	static int b=1;
	public static void main(String[] args) {
		int n=5;
		if(n==1) {
			System.out.print(0+" ");
		}
		else if(n==2) {
			System.out.print(0+" "+1+" ");//0,1,1,2,3,5
		}
		else {
			System.out.print(0+" "+1+" ");
			for(int i=2;i<=n;i++) {
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
			
			
		}
	}

}
