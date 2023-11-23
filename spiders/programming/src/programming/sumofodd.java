package programming;

public class sumofodd {
	public static void main(String[] args) {
//		int count=0;
		int sum=0;
		int n=765329;
		while(n!=0) {
			int l=n%10;
			if(l%2!=0) {
				sum+=l;
			}
			n=n/10;
//			count++;
			
		}
		System.out.println(sum);
	}
}
