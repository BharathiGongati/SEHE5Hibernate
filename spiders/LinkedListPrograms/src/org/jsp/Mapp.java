package org.jsp;

import java.util.*;

public class Mapp {
	public static void main(String[] args) {
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		m.put("abc", 10);
		m.put("xyz", 40);
		m.put("def", 20);
		m.put("pqr", 30);

		ArrayList<String> ar = new ArrayList<String>(m.keySet());
		for (int i = ar.size() - 1; i >= 0; i--) {
			System.out.println(m.get(ar.get(i)));
		}

//		Map<String, Integer> sm = new TreeMap<String, Integer>(m);
//
//		
//		for (Map.Entry<String, Integer> entry : sm.entrySet()) {
//			System.out.println(entry.getKey() + "==" + entry.getValue());
//		}

	}
}
