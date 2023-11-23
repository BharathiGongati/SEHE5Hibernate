package programming;

import java.io.*;

public class colllection {
	public static void main(String[] args) {
		File f=new File("demo.txt");
		try {
		f.createNewFile();
		if(f.exists()) {
			System.out.println("file created");
			System.out.println(f.getName());
			System.out.println(f.length());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			
		}
		      }
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}
		
	}


