package Student;

public class Test {
	public static void main(String[] args) {
		Bike b1=new Bike("duke",225000);
		Bike b2=new Bike("r15",225000);
		watch w1=new watch("sonata","gold",2500);
		watch w2=new watch("sonata","gold",2500);
		Object x[]= {b1,b2,w1,w2};
		for(int i=0;i<=x.length-1;i++) {
		    System.out.println(x[i]);
		}
		System.out.println("=========================");
		for(int i=0;i<=x.length-1;i++) {
		   if(x[i] instanceof Bike) {
			   System.out.println(x[i]);
		   }
		}
		System.out.println("=========================");
		for(int i=0;i<=x.length-1;i++) {
		   if(x[i] instanceof watch) {
			   System.out.println(x[i]);
		   }
		}

		
		}
	}