package nonprimitivecasting;

public class test {
	sonata s1=new sonata();
	fasttrack f=new fasttrack();
	relex r=new relex();
	static  Object getprice(int p){
		if(p==1) {
			return new sonata();
		}
		
		if(p==2) {
			return new fasttrack();
		}
		if(p==3) {
			return new relex();
		}
		else {
			return new watch();
		}
		
	}
	public static void main(String[] args) {
		Object x=getprice(4);//parent to child ni call cheyalevu
	     watch b=(watch)x;
	     //sonata c=(sonata)b;
	     //fasttrack f=(fasttrack)b;
	     //relex r=(relex)b;
	    
	     //System.out.println(c.z);//child to parent ni call cheyachu
	     //System.out.println(b.z);
	     //System.out.println(c.y);
	     //System.out.println(f.ff);
	     //System.out.println(r.d);
	     System.out.println(b.z);
	    
	     
		 
	}

}
