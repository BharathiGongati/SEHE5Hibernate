package programing;
public class firstlast {
	public static void main(String[] args) {
		int n=1235;
		int fl=n%10;
		int mid=0;
		n=n/10;
		while(n!=0) {
			int last =n%10;
			if(last==n) {
				fl=fl+last;
			}
			else {
				mid=mid+last;
			}
			n=n/10;
		}
		if(mid==fl) {
			System.out.println("xylem");
		}
		else {
			System.out.println("polem");
		}
		
	}

}
