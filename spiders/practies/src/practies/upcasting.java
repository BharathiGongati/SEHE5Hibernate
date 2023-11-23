package practies;

public class upcasting {
	String a="aaa";
	String b="bbb";
	int c=100;
	
	public static void main(String[] args) {
		
	}

}
class upcasting1 extends upcasting  {
	String j="ccc";
	String k="ddd";
	
	public static void main(String[] args) {
		
	}

}
class upcasting2 extends upcasting {
	int d=30000;
	
	public static void main(String[] args) {
		
		upcasting1 u2=new upcasting1();
		upcasting2 u3=new upcasting2();
		upcasting x[]= {u2,u3};
		upcasting t=x[1];
//		upcasting1 h=(upcasting1 )t;
//		System.out.println(h.a);
//		System.out.println(h.j);
		upcasting2 h1=(upcasting2 )t;
		System.out.println(h1.d);
		
		
		
		
	}
	
}



