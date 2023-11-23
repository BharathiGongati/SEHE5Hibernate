package Drink;

public class test {
	
	
	public static void main(String[] args) {
		Drink d1=new Drink("pepsi","maaza","coke","boost","cofee","tea");
		colddrink d2=new colddrink("pepsi","maaza","coke","boost","cofee","tea");
		hotdrink d3=new hotdrink("pepsi","maaza","coke","boost","cofee","tea");
		
		Object x[]= {d1,d2,d3};
		for (int i=0;i<=x.length-1;i++) {
		System.out.println(x[i]);
		}
		System.out.println("========================");
		for (int i=0;i<=x.length-1;i++) {
			if(x[i] instanceof colddrink) {
				System.out.println(x[i]);
			}
			}
		System.out.println("========================");
		for (int i=0;i<=x.length-1;i++) {
			if(x[i] instanceof hotdrink) {
				System.out.println(x[i]);
			}
			}


		
	}
}
