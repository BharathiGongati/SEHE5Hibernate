package programming;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readdd {
	public static void main(String[] args) {
		
		try {
			File f2=new File("demo.text");
			Scanner sc=new Scanner(f2);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
