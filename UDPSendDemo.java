package study26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 
 * @author 王伟 1.创建套接字对象 2.创建数据,得到长度,ip,端口 3.将上述内容打包 4.发送 5.关流
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
