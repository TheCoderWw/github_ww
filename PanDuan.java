package study15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PanDuan {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		ListIterator lit = list.listIterator();
		Boolean l = false;
		while (lit.hasNext()) {
			String s = (String) lit.next();
			if (s.equals("world")) {
				lit.add("javaee");
			}
		}
		System.out.println(list);
		System.out.println("*************");
		// if (l) {
		// list.add(3, "javaee");
		// }
		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// System.out.println(s);
		// }
	}
}
