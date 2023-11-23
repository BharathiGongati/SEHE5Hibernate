package marks;



public class Marks {
	
	
		void m1(int p) {
			if(p<35) {
				System.out.println("fail");
			 }
			 if(p>=35 && p<=59) {
				System.out.println("second-class");
				
			}
			 if(p>=60 && p<=80) {
				System.out.println("first-class");
			}
			 if(p>80) {
		    	System.out.println("Distinction");
		    }
			
		}
		public static void main(String[] args) {
			Marks ma=new Marks();
			ma.m1(60);
			
			
		}
		
}
			
		
		
	


