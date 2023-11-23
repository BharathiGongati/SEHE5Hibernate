package Student;

public class Bike {
	String name;
	int price;
	Bike(String n,int p){
		this.name=n;
		this.price=p;
	}
	public String toString() {
		return this.name+" "+this.price;
	}
}
 class watch {
	String brand,color;
	int price;
	watch(String b,String c, int p){
		this.brand=b;
		this.color=c;
		this.price=p;
	}
	public String toString() {
		return this.brand+" "+this.color+" "+this.price;
	}
}



