package study24;

public class StudentsDanLiDemo {
	public static void main(String[] args) {

		StudentsDanLi s = StudentsDanLi.getStudents();
		// StudentsDanLi.s = null;
		StudentsDanLi s2 = StudentsDanLi.getStudents();
		System.out.println(s == s2);
		System.out.println(s);
		System.out.println(s2);
		// System.out.println(s3);
	}
}
