package programming;

 interface interfac{
    void display1();
	
	public static void main(String[] args) {
		
	}
	}
 
 interface interfac1{
	 void display2(); 
	 public static void main(String[] args) {
		
	}
 }
  class dis implements interfac,interfac1{
	public void display1() {
		System.out.println("hello bujji"); 
	 }
	public  void display2() {
		System.out.println("hhhhh");
	}
	public static void main(String[] args) {
		dis d=new dis();
		d.display1();
		d.display2();
	}
 }