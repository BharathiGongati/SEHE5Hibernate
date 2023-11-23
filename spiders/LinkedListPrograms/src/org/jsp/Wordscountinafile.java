package org.jsp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wordscountinafile {
	public static void main(String[] args) throws Exception  {
		FileReader f1=new FileReader("bittu.txt");
		BufferedReader b1=new BufferedReader(f1);
		String s="";
		int count=0;
		while((s=b1.readLine())!=null) {
			String[] arr=s.split(" ");
			count=count+arr.length;
			
		}
		System.out.println(count);
	}

}
