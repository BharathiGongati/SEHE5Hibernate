package marks2;

public class Marks2 {
	void m1(int p,int c,int m,int optional) {
		double a=p+c+m+optional;
		double per=(a/400.0)*100.0;
		
	if(p<30 || c<30 || m<30 || optional<30) {
		
		System.out.println("Fail");
		if(p<30) {
			System.out.println("phy"+" "+p);
		}
		if(c<30) {
			System.out.println("che"+" "+c);
		}
		if(m<30) {
			System.out.println("math"+" "+m);
		}
		else {
			System.out.println("opti");
		}
	}
	else if(per>=30 && per<=40) {
		System.out.println("E");
	}
	else if(per>=41 && per<=59) {
		System.out.println("c");
	}
	else if(per>=60 && per<=70) {
		System.out.println("B");
	}
	else if(per>=70 && per<=80) {
		System.out.println("A");
	}
	else if(per>80) {
		System.out.println("A+");
	}
	}
	public static void main(String[] args) {
		
		Marks2 ma=new Marks2();
		ma.m1(34,16,25,43);
		
	}

}
