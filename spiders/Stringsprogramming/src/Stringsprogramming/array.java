package Stringsprogramming;

public class array {
	
	public static void main(String[]args){
		int[][] arr= {{12,45,32,88},{1,4,3,2},{7,15,2,4},{6,9,12,4}};
		int fsum=0;
		for(int i=0;i<=arr.length-1;i++) {
			int sum=0;
			int max=arr[i][0];
			for(int j=0;j<=arr[i].length-1;j++) {
				
				if(max<arr[i][j]) {
					max=arr[i][j];
					
					
					
				}
				
				
			}
			sum=sum+max;
			fsum=fsum+sum;
			
		}
		
		System.out.println(fsum);

	}

}
