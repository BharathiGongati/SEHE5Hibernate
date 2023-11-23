package programming;

import java.io.*;

public class serialisation implements Serializable {
	String name;
	int sal;
	public static void main(String[] args) {
		serialisation s1=new serialisation();
		s1.name="bharu";
		s1.sal=100;
		try {
		FileOutputStream fo=new FileOutputStream("demo1.text");
		ObjectOutputStream oos=new 	ObjectOutputStream(fo);
		oos.writeObject(s1);
		System.out.println("write completed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
