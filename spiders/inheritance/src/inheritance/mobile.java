package inheritance;

public class mobile {
   int x;
   String n="bittu";
   String y;
   void m1() {
	   this.x=100;
	   System.out.println(x);
	   System.out.println(y);
   }
   public static void main(String[] args) {
	mobile m1=new mobile();
	m1.y="bittu";
	m1.m1();
}
 
}
