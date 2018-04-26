package study24;

public class StudentsDanLi {
	private StudentsDanLi() {

	}

	private static class tem {
		private static StudentsDanLi ss = new StudentsDanLi();
	}

	public static StudentsDanLi getStudents() {
		return tem.ss;
	}
}
