package study19;

import java.io.File;
import java.util.Date;

/*
 * �����޸�ĳһ�ļ����µ������ض��������ļ�������
 * */
public class ReNameDemo {
	public static void main(String[] args) {
		File file = new File("D:\\eclipse\\eclipseWorkspace\\JABA");
		File[] fileArray = file.listFiles(); // ��ȡ�ļ�����
		for (File f : fileArray) { // ����
			if (f.isFile()) { // �ж��Ƿ�Ϊ�ļ�,ȥ���ļ���
				if (f.getName().endsWith(".txt")) { // �ж��Ƿ�Ϊ.txt��β
					Date date = new Date();
					long l = date.getTime(); // �õ���ǰʱ��ĺ���ֵ
					// System.out.println(l);
					String dizhi = "D:\\eclipse\\eclipseWorkspace\\JABA\\";
					String s = dizhi.concat(String.valueOf(l)).concat(".txt"); // s�����յ��ļ���
					// System.out.println(s);
					File file2 = new File(s);
					f.renameTo(file2); // ����
				}
			}
		}
	}
}
