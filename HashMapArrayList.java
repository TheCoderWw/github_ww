package study18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * HashMapǶ��ArrayList����
 * 
 * */

public class HashMapArrayList {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hsal = new HashMap<String, ArrayList<String>>();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("����");
		al1.add("���");
		hsal.put("��������", al1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("�����");
		al2.add("��ƽ֮");
		hsal.put("Ц������", al2);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("����");
		al3.add("���");
		hsal.put("�������", al3);
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
