package blocks;

public class father {
  String a="RGUKT";
  String name="Ongole";
  public static void main(String[] args) {
	
}
}

class son extends father{
	public static void main(String[] args) {
		son s1=new son();
		System.out.println(s1.a);
		System.out.println(s1.name);
	}
}
class grandson extends son{
	public static void main(String[] args) {
		grandson g1=new grandson();
		
		System.out.println(g1.a);
		System.out.println(g1.name);
		System.out.println("bharu");
		
	}
	
}
