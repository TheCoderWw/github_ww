package study20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	��a.txt�ļ������ݸ��Ƶ�b.txt��,һ�θ���һ���ֽ�����
 * */
public class CpoyFileDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\a.txt");
		FileOutputStream fout = new FileOutputStream("D:\\eclipse\\eclipseWorkspace\\JABA\\b.txt");
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fin.read(by)) != -1) {
			fout.write(by, 0, len);
		}
		fin.close();
		fout.close();
	}
}
