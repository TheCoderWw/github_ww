package study26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket ds;

	public ReceiveThread(DatagramSocket ds) {
		// TODO Auto-generated constructor stub
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			while (true) {
				byte[] buf = new byte[1024];
				// int length = buf.length;
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				// InetAddress address = dp.getAddress();
				String ip = dp.getAddress().getHostAddress();
				// byte[] s = dp.getData();
				// int len = dp.getLength();
				String a = new String(dp.getData(), 0, dp.getLength());
				System.out.println(ip + ":" + a);
				if (a.equals("886")) {
					break;
				}
			}
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
