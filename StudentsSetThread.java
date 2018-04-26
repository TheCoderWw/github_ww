package study24;

public class StudentsSetThread implements Runnable {
	private StudentsThread s;
	private int x = 0;

	public StudentsSetThread(StudentsThread s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (this.x % 2 == 0) {
				s.set("ww", 20);
			} else {
				s.set("ls", 22);
			}
			this.x++;
		}
	}
}