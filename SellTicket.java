package study24;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
	private int ticket = 100;
	Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ticket > -10) {
			try {
				lock.lock();
				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
				}
			} finally {
				lock.unlock();
			}
		}
	}

}
