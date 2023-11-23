package blocks;

public class bike {
	int phy;
	int che;
	static void total(int phy,int che) {
		int sum=phy+che;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		bike b1=new bike();
		bike.total(20, 10);
	}
}
