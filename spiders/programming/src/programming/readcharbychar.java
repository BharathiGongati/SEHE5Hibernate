package programming;

import java.io.*;

public class readcharbychar {
	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("demo.text");
			int i;
		   while((i=fr.read())!= -1) {
			   char c=(char)i;
			   System.out.println(c);
		   }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
		


