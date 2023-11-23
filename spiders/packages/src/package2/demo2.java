package package2;
import package1.student;

public class demo2 extends student  {
		public static void main(String[] args) {
			System.out.println("different class different package");
			demo2 d1=new demo2();
			System.out.println(d1.name);
			d1.study();
		}
		}


