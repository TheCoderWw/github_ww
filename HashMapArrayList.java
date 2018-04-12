package study18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * HashMap嵌套ArrayList遍历
 * 
 * */

public class HashMapArrayList {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hsal = new HashMap<String, ArrayList<String>>();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("吕布");
		al1.add("周瑜");
		hsal.put("三国演义", al1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("令狐冲");
		al2.add("林平之");
		hsal.put("笑傲江湖", al2);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("郭靖");
		al3.add("杨过");
		hsal.put("神雕侠侣", al3);
		Set<String> set = hsal.keySet();
		for (String s : set) {
			System.out.println(s + "----");
			ArrayList<String> al = hsal.get(s);
			Iterator<String> it = al.iterator();
			while (it.hasNext()) {
				String n = it.next();
				System.out.print(n);
				System.out.println();
			}
		}
	}
}
