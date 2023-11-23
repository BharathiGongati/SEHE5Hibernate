package practies;



public class throwkey {
	void display(int id ) {
		int actual_id=161884;
		if(id==actual_id) {
			System.out.println("insideclass");
		}
		else {
			System.out.println("outofclass");
			outofclassexception o=new outofclassexception();
			throw o;
		}
		
	}
	public static void main(String[] args) {
		throwkey t=new throwkey();
		t.display(161885);
	}

}
