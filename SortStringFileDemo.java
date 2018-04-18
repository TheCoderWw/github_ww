package study21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SortStringFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		String tem = null;
		if ((tem = br.readLine()) == null) {
			System.out.println("©унд╪Ч");
			System.exit(0);
		} else {
			String s = tem;
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			s = String.valueOf(ch);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
