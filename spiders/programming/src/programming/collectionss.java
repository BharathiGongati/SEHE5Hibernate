package programming;
import java.util.*;

public class collectionss {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("bahru");
		ar.add("harshu");
		ar.add("asifa");
		System.out.println(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==============");
		for(String g:ar) {
			System.out.println(g);
			
		}
		System.out.println("===================");
		LinkedList l2=new LinkedList();
		l2.add("akka");
		l2.add("amma");
		l2.add("nanna");
		ListIterator li=l2.listIterator(l2.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
	}

}
