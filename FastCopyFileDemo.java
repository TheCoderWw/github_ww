package study20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bin = new BufferedInputStream(
				new FileInputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt"));
		BufferedOutputStream bout = new BufferedOutputStream(
				new FileOutputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\c.txt"));
		// ���ǵ����ֽڽ���copy
		// int by = 0;
		// while ((by = bin.read()) != -1) {
		// bout.write(by);
		// }
		// bin.close();
		// bout.close();

		// �������ֽ��������copy
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bin.read(by)) != -1) {
			bout.write(by, 0, len);
		}
		bin.close();
		bout.close();
	}
}
