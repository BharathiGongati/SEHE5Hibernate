package programming;
import java.io.*;

public class deserialisation implements Serializable {
	public static void main(String[] args) {
		try {
			FileInputStream fr=new FileInputStream("demo1.text");
			ObjectInputStream ois=new ObjectInputStream(fr);
			  Object o=ois.readObject();
			  serialisation d=( serialisation)o;
			  System.out.println(d.name+" "+d.sal);
			  
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
