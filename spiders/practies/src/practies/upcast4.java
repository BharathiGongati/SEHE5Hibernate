package practies;

public class upcast4 {
	String s="cofee";
	public static void main(String[] args) {
		
	}
	}
class cild extends upcast4{
	String g="boost";
	public static void main(String[] args) {
		
	}
	
}
class cild1 extends upcast4{
	String n="horlics";
	public static void main(String[] args) {
		
	}
	
}
class test{
	public static void main(String[] args) {
		upcast4 u3=new upcast4();
		 cild1 u4=new   cild1();
	  upcast4 x[]= {u4,u3};
	  upcast4 z=x[0];
	  cild1 c=(cild1 )z;
	  System.out.println(c.n);
	  cild c1=(cild)z;
	  System.out.println(c1);
	  
	  }
}
