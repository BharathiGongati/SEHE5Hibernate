package programming;
import java.util.*;
public class mappp {
	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "bittu");
		m.put(2, "harshu");
		m.put(3, "akka");
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue("harshu"));
		System.out.println("================");
		System.out.println(m.get(4));
		System.out.println(m.size());
	}

}
