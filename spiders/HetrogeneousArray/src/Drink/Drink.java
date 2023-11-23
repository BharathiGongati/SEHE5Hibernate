package Drink;

public class Drink {
	String pepsi;
	String maaza;
	String coke;
	String boost;
	String cofee;
	String tea;
	 public Drink(String pepsi, String maaza, String coke, String boost, String cofee, String tea) {
			
			this.pepsi = pepsi;
			this.maaza = maaza;
			this.coke = coke;
			this.boost = boost;
			this.cofee = cofee;
			this.tea = tea;
		}
	
  

public String toString() {
	   return this.pepsi+" "+this.maaza+this.coke+" "+this.boost+" "+this.cofee+" "+this.tea;
   }
}
class colddrink extends Drink{
	 public colddrink(String pepsi, String maaza, String coke, String boost, String cofee, String tea) {
			super("1","2","3","4","5","6");
			this.pepsi = pepsi;
			this.maaza = maaza;
			this.coke = coke;
			this.boost = boost;
			this.cofee = cofee;
			this.tea = tea;
		}
	public String toString() {
		   return this.pepsi+" "+this.maaza+" "+this.coke;
	   }
	
	
	
	
}
class hotdrink extends Drink{
	 public hotdrink(String pepsi, String maaza, String coke, String boost, String cofee, String tea) {
			super("1","2","3","4","5","6");
			this.pepsi = pepsi;
			this.maaza = maaza;
			this.coke = coke;
			this.boost = boost;
			this.cofee = cofee;
			this.tea = tea;
		}
	 public String toString() {
		   return this.boost+" "+this.cofee+" "+this.tea;
	   }
	
}
	



