package practies;

public class employee {
	String name,company;
	int sal;
	public String toString(){
		return this.name+" "+this.company+" "+this.sal;
	}
	employee(String n,String c,int s)
	{
		this.name=n;
		this.company=c;
		this.sal=s;
	}
	public static void main(String[] args) {
		employee e1= new employee("bharu","wipro",200);
		employee e2= new employee("bharu","wipro",100);
		employee e3= new employee("bharu","wipro",400);
		employee x[]= {e1,e2,e3};
		for(int i=0;i<=x.length-1;i++) {
			System.out.println(x[i]);
		}
	}

}
