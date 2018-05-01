package study26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 
 * @author ��ΰ 1.�����׽��ֶ��� 2.��������,�õ�����,ip,�˿� 3.���������ݴ�� 4.���� 5.����
 */
public class UDPSendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
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
	}
}
