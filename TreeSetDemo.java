package study17;

/*
 * ��TreeSet�����Զ������
 * ���������С��������
 * *
 */
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Students> ts = new TreeSet<Students>();
		Students s1 = new Students("www", 15);
		Students s2 = new Students("lal", 19);
		Students s3 = new Students("ww", 5);
		Students s4 = new Students("lal", 19);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		for (Students s : ts) {
			System.out.println(s.getName() + "--" + s.getAge());
		}
	}
}
