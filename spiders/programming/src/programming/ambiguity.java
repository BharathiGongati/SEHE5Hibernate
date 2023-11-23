package programming;

import java.util.ArrayList;

public class ambiguity {
	String name,company;
	int sal;
	ambiguity(String n,String c,int s){
		this.name=n;
		this.company=c;
		this.sal=s;
	}
	public static void main(String[] args) {
		ambiguity a=new ambiguity("1","test",1577);
		ambiguity a1=new ambiguity("5","huikk",19007);
		ArrayList al=new ArrayList();
		al.add(a.name);
		al.add(a.company);
		al.add(a.sal);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
