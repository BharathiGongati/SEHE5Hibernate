package programing;

public class revsentance {
	public static void main(String[] args) {
		String str="Amma love you nanna love you ";
		String temp="";
		String arr[]=str.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			String n=arr[i];
			temp=n+" "+temp;
		}
		System.out.println(temp);
		
	}

}

