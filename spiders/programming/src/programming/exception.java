package programming;

public class exception {
	static void withdraw(int pin,int amount) {
		int acualpin=9052;
		int balance=20000;
		if(acualpin==pin) {
			if(amount<=balance) {
			System.out.println("wait for cash");
		    }
			
			else {
				try {
				insufficientbalanceexception ibe=new insufficientbalanceexception();
				throw ibe;
				}
				catch(insufficientbalanceexception e) {
					System.out.println("hiii");
				}
			}
			
		}
		else {
			try {
			incorrectpinexception ip=new incorrectpinexception ();
			throw ip;
			}
			catch(incorrectpinexception e) {
				System.out.println("bharu");
			}
		}
	  
	}
	public static void main(String[] args) {
		withdraw(952,90577);
	}

}
