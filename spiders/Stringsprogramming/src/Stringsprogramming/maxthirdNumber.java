package Stringsprogramming;

public class maxthirdNumber {
	public static int Max(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return arr[2];
		
	}
	public static void main(String[] args) {
		int[] arr= {14,3,4,2,9,3};
		int n=arr.length-1;
		System.out.println(Max(arr));
		for(int a:arr) {
			System.out.print(a+" ");
		}
			
	}

}
