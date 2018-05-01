package study26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);
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
	}
}
