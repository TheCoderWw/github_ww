package study24;

public class StudentsThreadDemo {
	public static void main(String[] args) {
		StudentsThread s = new StudentsThread();
		StudentsSetThread ss = new StudentsSetThread(s);
		StudentsGetThread sg = new StudentsGetThread(s);
		Thread t1 = new Thread(sg);
		Thread t2 = new Thread(ss);

		t1.start();
		t2.start();
	}
}
