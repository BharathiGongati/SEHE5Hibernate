package package2;

public class matrix3 {
	public static void main(String[] args) {
		int arr1[][]={{1,2,3},{4,5,6},{7,8,6}};
		int arr2[][]= {{1,2,4},{1,2,3},{1,2,3}};
		int arr3[][]=new int[arr1.length][arr2.length];
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[0].length;j++) {
		            arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
				}
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[0].length;j++) {
                     System.out.println(arr3[i][j]);
				}
			}
		}
		
		else {
	       	System.out.println("invalid");
		}
		}
	}
