package study17;

import java.util.HashSet;

public class hashSetDemo {
	public static void main(String[] args) {
		HashSet<Students> hs = new HashSet<Students>();
		Students s1 = new Students("www", 15);
		Students s2 = new Students("lal", 19);
		Students s3 = new Students("wwwww", 15);
		Students s4 = new Students("lal", 19);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		for (Students s : hs) {
			System.out.println(s.getName() + "------" + s.getAge());
		}
	}
}
