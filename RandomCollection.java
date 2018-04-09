package study16;

import java.util.ArrayList;
import java.util.Random;

/*
 * 求出10个1-20内的不重复数字*
 */
public class RandomCollection {
	public static void main(String[] args) {
		Random r = new Random();
		int tem = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (tem < 10) {
			int h = r.nextInt(20) + 1;
			if (!al.contains(h)) {
				al.add(h);
				tem++;
			}
		}
		System.out.println(al);
	}
}
