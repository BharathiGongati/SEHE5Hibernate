package org.jsp;

public class Triplet2 {
	public static void main(String[] args) {
		int[] arr = { 1,4,45,6,10,8};
		int tri = 22;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				for (int k = j + 1; k <= arr.length - 1; k++) {
//					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					int sum = arr[i] + arr[j] + arr[k];
					if (sum == tri) {
						System.out.println("====================");
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}

				}
			}
		}
	}
}
