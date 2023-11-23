package org.jsp;

public class BinaryArray {
	public static void main(String[] args) {
		int[] arr= {1,0,1,0,0,0,1,0,1};
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int j=0;j<=count-1;j++) {
			arr[j]=0;
		}
		for(int k=count;k<=arr.length-1;k++) {
			arr[k]=1;
		}
		for(int b:arr) {
			System.out.print(b+" ");
		}
		
	}

}
