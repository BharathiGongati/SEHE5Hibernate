package programming;
import java.util.*;
public class collection2 {
        public static void main(String[] args) {
			ArrayList al=new ArrayList();
			al.add("bharu");
			al.add("harshu");
			al.add("kavi");
			al.add(2,"amma");
			System.out.println(al);
			System.out.println(al.get(0));
			System.out.println(al.remove("amma"));
			System.out.println(al);
//			al.removeAll();
			al.clear();
			System.out.println(al);
			ArrayList a2=new ArrayList();
			a2.add("bharu");
			a2.add("harshu");
			a2.add("kavi");
			a2.add(2,"amma");
			System.out.println(a2);
			a2.removeAll(al);
			System.out.println(al);
			
			
		}
}
