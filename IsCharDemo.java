package study18;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class IsCharDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�������ַ���");
		String s = in.nextLine();
		char[] tem = s.toCharArray(); // �õ��ַ�����
		HashMap<Character, Integer> m = new HashMap<Character, Integer>(); // HashMap����
		for (int i = 0; i < tem.length; i++) {
			Integer j = m.get(tem[i]); // �õ�����ֵ(get�������ظü���Ӧ��ֵ,���û���򷵻�null)
			if (j == null) {
				m.put(tem[i], 1);
			} else {
				j++;
				m.put(tem[i], j); // �Գ��ֵĴ������и���
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = m.keySet(); // �õ�HashMap�ļ���set����
		for (char c : set) { // ����set
			Integer v = m.get(c); // ���ݼ���ֵ
			sb.append(c).append("(").append(v).append(")");
		}
		System.out.println(sb);
		in.close();
	}
}
