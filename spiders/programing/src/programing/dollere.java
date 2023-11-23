package programing;

public class dollere {
	public static void main(String[] args) {
		String str="entertainn";
		String temp="";
		
		for(int j=0;j<=str.length()-1;j++) {
			char ch=str.charAt(j);
			int count=0;
			if(temp.indexOf(ch)==-1) {
				
				for(int i=0;i<=str.length()-1;i++) {
					char k=str.charAt(i);
					if(ch==k) {
						count++;
					}
				}
				temp=temp+ch;
				System.out.println(ch+" "+count);
			}
			
			
		}
		
		
	}

}
