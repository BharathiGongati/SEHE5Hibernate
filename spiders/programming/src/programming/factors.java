package programming;

public class factors {
	public static void main(String[] args) {
		int n=45;
		int i=1;
		int count=0;
		while(i<10) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("count_value"+" "+count);
	}

}
