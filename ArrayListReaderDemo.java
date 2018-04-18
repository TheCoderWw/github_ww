package study21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Array.txt"));
		ArrayList<String> al = new ArrayList<>();
		String s = null;
		while ((s = br.readLine()) != null) {
			al.add(s);
		}
		for (String m : al) {
			System.out.println(m);
		}
		br.close();
	}
}
