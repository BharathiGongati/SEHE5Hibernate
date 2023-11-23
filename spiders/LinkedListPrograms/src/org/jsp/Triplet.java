package org.jsp;

public class Triplet {
	public static void main(String[] args) {
		int[] arr = {1,4,45,6,10,8};
	
		int tri = 22;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 2; j++) {
//				System.out.println(arr[i] +" "+ arr[j] + " "+arr[j + 1]);
				int sum = arr[i] + arr[j] + arr[j + 1];
//				System.out.println(sum);
				if (tri==sum) {
					System.out.println("======================");
					System.out.println(arr[i] + " " + arr[j] + " " + arr[j + 1]);
				}
			}
		}
	}

}
