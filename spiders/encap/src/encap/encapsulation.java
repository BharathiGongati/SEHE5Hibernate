package encap;

public class encapsulation {
	private String name;
	private int age;
	public void setname(String n) {
		this.name=n;
	}
	public void setage(int m) {
		if(m>=0 && m<=100) {
			this.age=m;
			
		}
		else {
			System.out.println("inavalid age");
		}
	}
	public String getname() {
		return this.name;
	}
	public int getage() {
		return age;
		
	}
	public static void main(String[] args) {
		encapsulation e1=new encapsulation();
		e1.setname("bharu");
	    System.out.println(e1.getname());
	    e1.setage(1008);
	    System.out.println(e1.getage());
	}
	

}
