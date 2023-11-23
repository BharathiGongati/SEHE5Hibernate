package org.jsp;

public class ThirgNumber {
	public static void main(String[] args) {
		
		 int[] arr= {2,1,9,3,9,10,23};
		 for(int i=0;i<=arr.length-1;i++) {
			 for(int j=i+1;j<=arr.length-1;j++) {
				 if(arr[i]>arr[j]) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
	
		 }
		 System.out.println(arr[arr.length-3]);
	}

}
