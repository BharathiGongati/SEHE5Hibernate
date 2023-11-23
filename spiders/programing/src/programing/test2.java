package programing;

public class test2 {
	public static void main(String[] args) {
		int n=5;
		int mid=n/2+1;
		int space=mid-1;
		int star=1;
		for(int i=1;i<=n;i++) {
			int t=1;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=star;k++) {
				int m=star/2+1;
				if(k<m) {
					System.out.print(t++);
				}
				else {
					System.out.print(t--);
				}
				
			}
			if(i<mid) {
				space--;
				star+=2;
				
			}
			else {
				space++;
				star-=2;
				
				
			}
			System.out.println();
			
		}
		
	}

}
