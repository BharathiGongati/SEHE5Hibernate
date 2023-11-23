package programming;

import java.io.*;


public class exception3 {
	void display() throws IOException{
			FileWriter fw =new FileWriter("demo.txt");
	}
	
	
	public static void main(String[] args) {
		
		exception3 e=new exception3();
		try {
			e.display();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
