package study26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiveDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket sk = ss.accept();
		InputStream is = sk.getInputStream();
		byte[] a = new byte[1024];
		int len = 0;
		while ((len = is.read(a)) != -1) {
			String ip = sk.getInetAddress().getHostAddress();
			String s = new String(a, 0, len);
			System.out.println("from:" + ip + "data:" + s);

			OutputStream os = sk.getOutputStream();

			os.write(" ’µΩ".getBytes());

		}

	}
}
