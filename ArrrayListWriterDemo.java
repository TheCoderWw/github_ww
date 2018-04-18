package study21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrrayListWriterDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("java");
		al.add("SE");
		BufferedWriter bw = new BufferedWriter(new FileWriter("Array.txt"));
		for (String s : al) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
