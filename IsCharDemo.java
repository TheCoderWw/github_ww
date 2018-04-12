package study18;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class IsCharDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s = in.nextLine();
		char[] tem = s.toCharArray(); // 得到字符数组
		HashMap<Character, Integer> m = new HashMap<Character, Integer>(); // HashMap构造
		for (int i = 0; i < tem.length; i++) {
			Integer j = m.get(tem[i]); // 得到返回值(get方法返回该键对应的值,如果没有则返回null)
			if (j == null) {
				m.put(tem[i], 1);
			} else {
				j++;
				m.put(tem[i], j); // 对出现的次数进行更新
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = m.keySet(); // 得到HashMap的键的set集合
		for (char c : set) { // 遍历set
			Integer v = m.get(c); // 根据键拿值
			sb.append(c).append("(").append(v).append(")");
		}
		System.out.println(sb);
		in.close();
	}
}
