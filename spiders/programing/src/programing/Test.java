package programing;

public class Test {
	public static void main(String[] args) {
		int n=5;
		int t=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print(t);
				 }
				else {
					System.out.print(" ");
				}
			
		    }
			System.out.println();
			int mid=n/2+1;
			if(i<mid) {
				t++;
			}
			else {
				t--;
			}
			
	   }
	}
}


