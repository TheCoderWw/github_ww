package study16;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 
 * 			ȥ�������е��ظ�Ԫ��
 * 
 * */
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("hello");
		al.add("javaee");
		al.add("andoroid");
		al.add("javaee");
		System.out.println("ԭʼ����Ϊ:" + al);
		ArrayList a2 = new ArrayList();
		Iterator it = al.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (!a2.contains(s)) {
				a2.add(s);
			}
		}
		System.out.println(a2);
	}
}
