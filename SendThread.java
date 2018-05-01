package study26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendThread implements Runnable {
	private DatagramSocket ds;

	public SendThread(DatagramSocket ds) {
		// TODO Auto-generated constructor stub
		this.ds = ds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			String line = null;
			while ((line = in.nextLine()) != null) {
				byte[] a = line.getBytes();
				int length = a.length;
				InetAddress address = InetAddress.getByName("172.22.225.51");
				int dk = 10086;
				DatagramPacket dp = new DatagramPacket(a, length, address, dk);
				ds.send(dp);
				if (line.equals("886")) {
					break;
				}
			}
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
