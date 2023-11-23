package Stringsprogramming;

import java.util.Scanner;

public class lastdigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int[]  arr= {50,30,100,40,5,1000}; 
		int min =arr[0] ;
		int sum = 0;
        for (int j = 0; j <= arr.length - 1; j++) {
			if (min> arr[j]) {
				min= arr[j];
			}
		}
		System.out.println(min);

	}
}