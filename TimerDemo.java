package study24;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTimer(t), 3000, 2000);
	}
}

class MyTimer extends TimerTask {
	private Timer t;

	public MyTimer(Timer t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ab");
	}

}
