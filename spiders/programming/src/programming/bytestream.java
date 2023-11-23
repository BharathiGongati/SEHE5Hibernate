package programming;
import java.io.*;

public class bytestream {
	public static void main(String[] args) {
		try {
			
			FileInputStream fi=new FileInputStream("demo.text");
			FileOutputStream fo=new FileOutputStream("paste.text");
			int i;
			while((i=fi.read())!= -1) {
				char c=(char)i;
				fo.write(c);
				System.out.println("write operation done");
			}
			fi.close();
			fo.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
