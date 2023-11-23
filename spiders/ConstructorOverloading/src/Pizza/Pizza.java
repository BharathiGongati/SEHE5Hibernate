package Pizza;

public class Pizza {
	final String type="Regular";
	int price=150;
	String toping1,toping2;
	boolean cheese;
	//No Toping Pizza
	Pizza(boolean c)
	{
		this.cheese=c;
		if(c==true)
		{
			this.price=this.price+40;
		}
	}
	//one Toping Pizza
	Pizza(String t1,boolean c)
	{
		this.topping=t1;
		this.cheese=c;
		if(c==true)
		{
		this.price=this.price+40+40;
		}
		else
		{
			this.price=this.price+40;
		}
	}
	//two toping pizza
	Pizza(String t1,String t2,boolean c)
	{
		this.toping1=t1;
		this.toping1=t2;
		this.cheese=c;
		if(c==true)
		{
			this.price=this.price+70+40;
		}
		else
		{
			this.price=this.price+70;
		}
	}
	
}
