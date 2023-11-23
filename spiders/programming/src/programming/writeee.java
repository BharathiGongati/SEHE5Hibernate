package programming;

import java.io.*;
public class writeee {
	public static void main(String[] args) {
		try {
		FileWriter f1=new FileWriter("demo.text");
	    f1.write("akkaaaaaaaaaa loveyou");
		System.out.println("reading completed");
		f1.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
