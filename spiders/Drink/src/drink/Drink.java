package drink;

public class Drink {
	String x="pepsi";
	String y="maaza";
	String z="coke";
	String a="boost";
	String b="coffee";
	String c="tea";
	public String toString () {
		return this.x+" "+this.y+" "+this.z+" "+this.a+" "+this.b+" "+this.c;
	}
	public static void main(String[] args) {
		Drink d1=new Drink();
		colddrink c1=new colddrink();
		hotdrink h1=new hotdrink();
		Drink x[]= {d1,c1,h1};
		for(int i=0;i<=x.length-1;i++) {
			System.out.println("======");
			System.out.println(x[i]);
		}
	}
}
class colddrink extends Drink{
	public String toString() {
		return this.x+" "+this.y+" "+this.z;
	}
	public static void main(String[] args) {
		
	}
}
class hotdrink extends Drink {
	public String toString() {
		return this.a+" "+this.b+" "+this.c;
	}
	public static void main(String[] args) {
		
	}
}

