package study26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPSendDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("172.22.225.51", 8888);
		Scanner in = new Scanner(System.in);
		String line = null;
		;
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		while ((line = in.nextLine()) != null) {
			if (line.equals("886")) {
				break;
			}
			os.write(line.getBytes());
			byte[] a = new byte[1024];
			int len = is.read(a);
			String demo = new String(a, 0, len);
			System.out.println(demo);
		}
		s.close();
	}
}
