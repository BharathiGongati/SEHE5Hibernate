package Stringsprogramming;

public class BracketBalencing {
	static char[] stack;
	static int top;
	static void push() {
		top++;
		stack[top]='(';
	}
	static void pop() {
		top--;
	}
	public static void main(String[] args) {
		 top=-1;
		boolean flag=true;
		String s="))((";
		stack=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				push();
			}
			else if (top==-1 && c==')') {
				flag=false;
				break;
			}
			else if(c==')'&& stack[top]=='(') {
				pop();
			}
		}
		if(top==-1 && flag==true) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}
	

}
