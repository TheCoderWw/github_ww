package study15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorTest {
	public static void main(String[] args) {
		List<Students> c = new ArrayList<Students>();
		Students s = new Students("wang", 20);
		Students s1 = new Students("wang1", 20);
		Students s2 = new Students("wang2", 20);
		Students s3 = new Students("wang3", 20);
		Students s4 = new Students("wang4", 20);

		c.add(s);
		c.add(s1);
		c.add(s3);
		c.add(s2);
		c.add(s4);
		Students n = (Students) c.get(2);
		System.out.println(n.getName());
		Iterator i = c.iterator();
		while (i.hasNext()) {
			Students m = (Students) i.next();
			System.out.println(m.getName() + "********" + m.getAge());
		}
	}
}
