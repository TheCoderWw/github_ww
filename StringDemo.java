import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author 王伟
 * 
 * @return m[p][q]
 */
public class StringDemo {
	public static void main(String[] args) throws IOException {
		// 文件中读取字符串
		BufferedWriter br = new BufferedWriter(new FileWriter("output.txt"));
		BufferedReader bw = new BufferedReader(new FileReader("input.txt"));
		String a = bw.readLine();
		String b = bw.readLine();
		int i = Length(a, b);
		br.write(String.valueOf(i));
		br.close();
		bw.close();
	}

	public static int Length(String a, String b) {
		// 获取字符串的长度
		int p = a.length();
		int q = b.length();
		int tem; // 用于计算是否为替换或相同
		char x; // 获取字符串的每个字符
		char y;
		int[][] m = new int[p + 1][q + 1]; // 创建二维数组
		if (p == 0) {
			return q;
		}
		if (q == 0) {
			return p;
		}
		// 初始化
		for (int i = 0; i <= p; i++) {
			m[i][0] = i;
		}
		for (int j = 0; j <= q; j++) {
			m[0][j] = j;
		}
		for (int i = 1; i <= p; i++) {
			x = a.charAt(i - 1);
			for (int j = 1; j <= q; j++) {
				y = b.charAt(j - 1);
				if (x == y) {
					tem = 0;
				} else
					tem = 1;
				m[i][j] = Min(m[i - 1][j] + 1, m[i][j - 1] + 1, m[i - 1][j - 1] + tem);
			}
		}
		return m[p][q];
	}

	public static int Min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
