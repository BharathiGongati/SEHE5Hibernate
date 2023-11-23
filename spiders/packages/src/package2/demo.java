package package2;
import package1.student;

public class demo {
public static void main(String[] args) {
	System.out.println("different class different package");
    student s3=new student();
//	demo d1=new demo();
	System.out.println(s3.name);
	s3.study();
}
}
