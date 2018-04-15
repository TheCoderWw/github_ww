package study20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	将a.txt文件的内容复制到b.txt中,一次复制一个字节
 * */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		FileOutputStream fout = new FileOutputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\b.txt");
		int by = 0;
		while ((by = fin.read()) != -1) {
			fout.write(by);
		}
		fin.close();
		fout.close();
	}
}
