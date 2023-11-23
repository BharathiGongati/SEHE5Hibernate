package org.jsp;

public class prime {
	
	public static void main(String[] args) {
		int n=10;
		int count=0;
		
		for(int j=1;j<=n;j++) {
			int c=0;
			for(int i=1;i<=n;i++) {
				if(j%i==0) {
					c++;
				}
			}
			if(c==2) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
