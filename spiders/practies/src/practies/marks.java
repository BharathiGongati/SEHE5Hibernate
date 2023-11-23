package practies;
   public class marks {
	 String name;
	 int phy,che,mat;
	marks(String n,int p,int c,int m ){
		this.name=n;
		this.phy=p;
		this.che=c;
		this.mat=m;
}
	void display1(){
		
		float total=this.phy+this.che+this.mat;
		System.out.println(total);
	}
   void display2(){
		
		System.out.println((this.phy+this.che+this.mat)/300.0f*100.0f);
	}
   void display3(){
	
	System.out.println(this.phy);
	System.out.println(this.che);
	System.out.println(this.mat);
   }
	public static void main(String[] args) {
		marks m1=new marks("harshu",50,60,80);
		marks m2=new marks("bharu",60,70,90);
		m1.display1();
		m1.display2();
		m1.display3();
		
	}
}
