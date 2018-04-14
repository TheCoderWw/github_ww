package study19;

import java.io.File;
import java.util.Date;

/*
 * 批量修改某一文件夹下的所有特定条件的文件的名称
 * */
public class ReNameDemo {
	public static void main(String[] args) {
		File file = new File("D:\\eclipse\\eclipseWorkspace\\JABA");
		File[] fileArray = file.listFiles(); // 获取文件数组
		for (File f : fileArray) { // 遍历
			if (f.isFile()) { // 判断是否为文件,去除文件夹
				if (f.getName().endsWith(".txt")) { // 判断是否为.txt结尾
					Date date = new Date();
					long l = date.getTime(); // 得到当前时间的毫秒值
					// System.out.println(l);
					String dizhi = "D:\\eclipse\\eclipseWorkspace\\JABA\\";
					String s = dizhi.concat(String.valueOf(l)).concat(".txt"); // s是最终的文件名
					// System.out.println(s);
					File file2 = new File(s);
					f.renameTo(file2); // 改名
				}
			}
		}
	}
}
