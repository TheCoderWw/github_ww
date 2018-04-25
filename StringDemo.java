import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author ��ΰ
 * 
 * @return m[p][q]
 */
public class StringDemo {
	public static void main(String[] args) throws IOException {
		// �ļ��ж�ȡ�ַ���
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
		// ��ȡ�ַ����ĳ���
		int p = a.length();
		int q = b.length();
		int tem; // ���ڼ����Ƿ�Ϊ�滻����ͬ
		char x; // ��ȡ�ַ�����ÿ���ַ�
		char y;
		int[][] m = new int[p + 1][q + 1]; // ������ά����
		if (p == 0) {
			return q;
		}
		if (q == 0) {
			return p;
		}
		// ��ʼ��
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
