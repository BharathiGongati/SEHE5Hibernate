package practies;


public class custom extends RuntimeException {
	public static void main(String[] args) {
		
	}

}
class classexception{
	static void display(int id) {
		int actualid=14118;
		if(id==actualid) {
			System.out.println("inclass");
		}
		else {
			custom c1=new custom();
			throw c1;
		}
		
	}
	public static void main(String[] args) {
		display(14118);
	}
}
