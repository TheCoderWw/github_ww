package study24;

public class StudentsGetThread implements Runnable {
	private StudentsThread s;

	public StudentsGetThread(StudentsThread s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			s.get();
		}
	}
}
