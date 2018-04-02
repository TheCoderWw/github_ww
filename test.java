package study;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tem = in.nextLine();
		int i = 0, j = 0, k = 0;
		for (int index = 0; index < tem.length(); index++) {
			char s = tem.charAt(index);
			if (s >= 'A' && s <= 'Z') {
				i++;
			} else if (s >= 'a' && s <= 'z') {
				j++;
			} else if (s >= '0' && s <= '9') {
				k++;
			}

		}
		System.out.println("daxie=" + i + ",xiaoxie=" + j + ",shuzi=" + k);
		in.close();
	}
}
