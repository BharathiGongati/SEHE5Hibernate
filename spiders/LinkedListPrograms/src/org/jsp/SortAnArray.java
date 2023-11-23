package org.jsp;

public class SortAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 87, 23, 9 };
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		for (int a1 : arr) {
			System.out.print(a1 + " ");
		}

	}

}
