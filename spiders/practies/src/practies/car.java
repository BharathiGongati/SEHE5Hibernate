package practies;

public class car {
	String name,color;
	int price;
	car(String n,String c,int p){
		this.name=n;
		this.color=c;
		this.price=p;
	}
	public String toString() {
		return this.price+"";
		
	}
public static void main(String[] args) {
	car c1=new car("bharu","blue",2500);
	car c2=new car("asifa","white",30);
	car c3=new car("har","suuse",00);
	car x[]= {c1,c2,c3};
	for(int i=0;i<=x.length-1;i++) {
		System.out.println(x[i]);
	
}
}
}
