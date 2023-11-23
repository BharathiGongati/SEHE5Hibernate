package programing;

public class strong_number {
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		while(n!=0) {
			int last=n%10;
			int fact=1;//for every iteration it will become 1
			for(int i=1;i<=last;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println(temp+" "+"Strong number");
		}
		else {
			System.out.println(temp+" "+"Not a Strong");
		}
	} 
}
