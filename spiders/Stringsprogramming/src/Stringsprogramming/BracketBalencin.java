package Stringsprogramming;

public class BracketBalencin {
	static char[] stack;
	static int top;
	static void push(char ele) {
		top++;
		stack[top]=ele;
	}
	static void pop() {
		top--;
	}
	public static void main(String[] args) {
		top=-1;
		boolean flag=true;
		String s="}{{{{";
		
		stack=new char[s.length()];
		for(int i=0;i<s.length();i++ ) {
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[') {
				push(c);
			}
			else if((top!=-1)&&((c==')'&&stack[top]=='(')||(c=='}'&&stack[top]=='{')||(c==']'&&stack[top]=='['))){
				pop();
			}
			else {
				flag=false;
				break;
			}
		}
		if(top==-1&&flag==true) {
			System.out.println("balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}

}
