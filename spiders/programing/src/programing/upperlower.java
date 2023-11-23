package programing;

public class upperlower {
	public static void main(String[] args) {
		String str="bhRuHaRu cGimGGHbb";
		String temp="";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
            if(ch>='A' && ch<='Z') {
            	char x=(char)(ch+32);
            	temp=temp+x;
            			
            			
			}
            else if(ch>='a' && ch<='z') {
            	char y=(char)(ch-32);
            	temp=temp+y;
			}
            else {
            	temp=temp+ch;
            }
		}
		System.out.println(temp);
	}

}
