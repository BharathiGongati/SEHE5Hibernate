package Stringsprogramming;

public class found {
	public static void main(String[] args) {
		String str="bharauharshu";
		String temp="";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			int count=0;
			if(temp.indexOf(ch)==-1) {
				
				for(int j=0;j<=str.length()-1;j++) {
					char k=str.charAt(j);
					if(ch==k) {
						count++;
					}
				}
				temp=temp+ch;
				System.out.println(ch+" "+"occured"+" "+count+" "+"times");
			
			}
			
				
		}
	}

}
