package study;

public class test2 {
	public static void main(String[] args) {
		String s = new String("helloWorld");
		char a = s.toUpperCase().charAt(0);
		char[] b = s.toLowerCase().toCharArray();
		b[0] = a;
		System.out.println(s.valueOf(b));
	}
}
