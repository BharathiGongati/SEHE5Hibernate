package Stringsprogramming;

public class MergeSort {
	static void sort(int[] arr) {

		int l = 0;
		int h = arr.length - 1;
		int m = (l + h) / 2;
		int[] L = new int[m - l + 1];
		int[] R = new int[h - m];
		int k = l;
		for (int i = 0; i < L.length; i++) {
			L[i] = arr[k];
			k++;
		}
		for (int i = 0; i < R.length; i++) {
			R[i] = arr[k];
			k++;
		}
		k = 0;
		int i = 0, j = 0;
		while (i < L.length && j < R.length) {
			if (L[i] < R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			} else {
				arr[k] = R[j];
				k++;
				j++;
			}
		}
		while (i < L.length) {
			arr[k] = L[i];
			k++;
			i++;
		}
		while (j < R.length) {
			arr[k] = R[j];
			k++;
			j++;
		}
		for (int b1 : arr) {
			System.out.print(b1 + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 6, 10, 15, 11, 77, 88 };
		sort(arr);
	}
}
