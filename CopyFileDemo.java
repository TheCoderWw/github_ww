package study20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	��a.txt�ļ������ݸ��Ƶ�b.txt��,һ�θ���һ���ֽ�
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
