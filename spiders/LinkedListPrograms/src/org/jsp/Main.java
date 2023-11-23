package org.jsp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		String[] testArray1 = { "coffee", "tea", "water" };
		String[] testArray2 = { "lemonade", "juice", "water" };
		mergeUniqueValues(testArray1, testArray2);
	}

	public static void mergeUniqueValues(String[] arr1, String[] arr2) {
		Set noDuplicateSet = new HashSet();
		noDuplicateSet.addAll(Arrays.asList(arr1));
		noDuplicateSet.addAll(Arrays.asList(arr2));

//		String[] noDuplicateArray = new String[noDuplicateSet.size()];
//		noDuplicateSet.toArray(noDuplicateArray);
//		Arrays.sort(noDuplicateArray);
		Object[]  arr=noDuplicateSet.toArray();

		System.out.println("Your sorted array is: ");
		for (Object str : arr) {
			System.out.print(str+"  ");
		}
	}
}
