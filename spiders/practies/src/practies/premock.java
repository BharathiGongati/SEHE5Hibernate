package practies;

public class premock {
	premock(){
		System.out.println("bike");
	}
	premock(int a){
		System.out.println("car");
	}
	public static void main(String[] args) {
		
	}

}
class premock2 extends premock{
	premock2(){
		super(10);
		}
	premock2(int a){
	}
	
	public static void main(String[] args) {
		premock2 p1=new premock2();
		premock2 p2=new premock2(10);
		
	}
}
