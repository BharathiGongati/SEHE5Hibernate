package programing;

public class halfdaimond {
	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(ch++);
			}
			space--;
			star=star+2;
			System.out.println();
		}
	}

}
