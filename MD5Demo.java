package study20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author ��ΰ
 *
 */
public class MD5Demo {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// InputStream file = new
		// InputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		FileInputStream fin = new FileInputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		FileOutputStream fout = new FileOutputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		System.out.println("������Ҫ���ܵ��ַ���");
		String s = in.nextLine();
		MD5Util md = new MD5Util();
		String mds = md.crypt(s); // md5����
		String mds1 = md.crypt(mds); // ˫�ؼ���
		try {
			fout.write(mds1.getBytes());
			System.out.println("�����Ѽ��ܱ���");
		} catch (Exception e) {
			e.getMessage();
		} finally {
			fout.close();
			in.close();
		}
	}
}
