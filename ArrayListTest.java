package study15;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest {
	public static void main(String[] args) {
		Collection<Students> c = new ArrayList<Students>();
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
		Object[] obj = c.toArray(); // 将集合转化为数组
		for (int i = 0; i < obj.length; i++) { // 遍历数组
			Students m = (Students) obj[i];
			System.out.println(m.getName() + "----------" + m.getAge());
		}
	}
}

class Students {
	private String name = null;
	private int age = 0;

	public Students() {

	}

	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
