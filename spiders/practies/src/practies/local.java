package practies;

public class local {
	void display1() {
		int x=100;
		System.out.println(x);
	}
	void display2() {
		int x=200;
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		local l=new local();
		l.display2();
	}

}
