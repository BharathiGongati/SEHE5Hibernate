package package1;

public class student {
	protected String name="rahul";
	protected void study() {
		System.out.println("studt-method");
		
	}
	public static void main(String[] args) {
		System.out.println("with in same class");
		student s2=new student();
		System.out.println(s2.name);
		s2.study();
	}

}
