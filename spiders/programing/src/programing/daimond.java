package programing;

public class daimond {
	public static void main(String[] args) {
		int n=9;
		int mid=(n/2)+1;
		int star=1;
		int space=mid-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(k);
			}
			if(i<mid) {
				space--;
				star=star+2;
			}
			else {
				space++;
				star=star-2;
			}
			System.out.println();
			
			
		}
		
	}

}
