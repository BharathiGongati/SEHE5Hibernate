package Stringsprogramming;

public class frechar {
	public static void main(String[] args) {
		String s="bcgacaadddddcc";
		int[] arr=new int[128];
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			arr[c]++;
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				char ch=(char)i;
				System.out.println(ch+" "+arr[i]);
	            
		    }
	   }

	
}
}
