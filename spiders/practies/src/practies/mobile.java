package practies;

public class mobile {
	String name;
	int price;

	public mobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

	}

}

class Laptop {
	String brand;
	int price;

	public Laptop(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public static void main(String[] args) {

	}

}
class demo {
	public static void main(String[] args) {
		mobile m1 = new mobile("1plus", 54466);
		mobile m2 = new mobile("iphone", 89900);
		Laptop l1 = new Laptop("hp", 67899);
		Laptop l2 = new Laptop("dell", 78990);
		Object x[] = { m1, m2, l1, l2 };
		for (int i = 0; i <= x.length - 1; i++) {
			System.out.println(x[i]);
//			if (x[i] instanceof mobile) {
//				Object o = x[i];
//				mobile m3 = (mobile) o;
//				System.out.println(m3.name);
//			} else {
//				Object o = x[i];
//				Laptop m3 = (Laptop) o;
//				System.out.println(m3.brand);
//
//			}

		}
	}
}
