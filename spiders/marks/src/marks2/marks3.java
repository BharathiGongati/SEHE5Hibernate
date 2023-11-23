package marks2;

public class marks3 {
	void m1(int p,int c,int m,int optional) {
		double a=p+c+m+optional;
		double per=(a/400.0)*100.0;
		
	if(p<30 || c<30 || m<30 || optional<30) {
		System.out.println("Fail");
	}
	else {
		if(per>=30 && per<=40) {
			System.out.println("E");
		}
		if(per>=41 && per<=59) {
			System.out.println("c");
		}
	    if(per>=60 && per<=70) {
			System.out.println("B");
		}
		if(per>=70 && per<=80) {
			System.out.println("A");
		}
		if(per>80) {
			System.out.println("A+");
		}

	}
	
	}
	public static void main(String[] args) {
		marks3 maa= new marks3();
		maa.m1(61,82, 90, 70);
		
	}
}
		


