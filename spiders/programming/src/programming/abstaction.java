package programming;

abstract public class abstaction {
	abstract void chopedveg();
	abstract void preparedish();
	public static void main(String[] args) {
		
	}

}
class vegetable extends abstaction{
	void chopedveg() {
		System.out.println("hello");
	}
	void preparedish() {
		System.out.println("harshu");
		
	}
	public static void main(String[] args) {
		vegetable v=new vegetable();
		v.chopedveg();
		v.preparedish();
	}
	
}
