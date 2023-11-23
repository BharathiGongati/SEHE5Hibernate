package practies;

public class upcastingh {
	String a;
	String b;

	upcastingh(String s1, String s2) {
		this.a = s1;
		this.b = s2;
	}

	public static void main(String[] args) {
	}
}

class upcast2 {
	String a1;
	String b1;

	upcast2(String s3, String s4) {
		this.a1 = s3;
		this.b1 = s4;
	}

	public static void main(String[] args) {
	}
}

class upcast3 {
	String a2;
	String b2;

	upcast3(String s1, String s2) {
		this.a2 = s1;
		this.b2 = s2;
	}

	public static void main(String[] args) {
		upcastingh u1 = new upcastingh("bharu", "harshu");
		upcast2 u2 = new upcast2("chinni", "kavi");
		Object x[] = { u1, u2 };
		for (int i = 0; i <= x.length - 1; i++) {
			if (x[i] instanceof upcastingh) {
				upcastingh u6 = (upcastingh) x[i];
				System.out.println(u6.a);
			}
		}
	}
}
