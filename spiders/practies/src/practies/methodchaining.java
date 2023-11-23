package practies;

public class methodchaining {
	String fname(String a) {
		return "$"+a;
	}
	String lname(String b) {
		return b+"$";
	}
	String fullname() {
		String a=this.fname("Rahul");
		String b=this.lname("Dravid");
		return a+" "+b;
		
		
	}
	public static void main(String[] args) {
		methodchaining m1=new methodchaining();
		String y=m1.fullname();
		System.out.println(y);
		
		
	}

}
