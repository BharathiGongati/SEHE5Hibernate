package Stringsprogramming;

public class counting_words {
 public static void main(String[] args) {
	  String str="bharu   has good heart ";
	  str=str.trim();
	  int count=0;
	  for(int i=0;i<=str.length()-1;i++) {
		  char ch=str.charAt(i);
		  if((ch==' ' && str.charAt(i+1)!=' ')||(i==str.length()-1)) {
			  
			  count++;
		  }
	  }
	  System.out.println(count);
}
}
