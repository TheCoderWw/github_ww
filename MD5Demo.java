package study20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author 王伟
 *
 */
public class MD5Demo {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// InputStream file = new
		// InputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		FileInputStream fin = new FileInputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		FileOutputStream fout = new FileOutputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		System.out.println("请输入要加密的字符串");
		String s = in.nextLine();
		MD5Util md = new MD5Util();
		String mds = md.crypt(s); // md5加密
		String mds1 = md.crypt(mds); // 双重加密
		try {
			fout.write(mds1.getBytes());
			System.out.println("密码已加密保存");
		} catch (Exception e) {
			e.getMessage();
		} finally {
			fout.close();
			in.close();
		}
	}
}
