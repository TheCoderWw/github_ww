package study17;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<student> ts = new TreeSet<student>();
		student s1 = new student("ww", 90, 80, 70);
		student s2 = new student("la", 100, 100, 70);
		student s3 = new student("nn", 90, 86, 70);
		student s4 = new student("ls", 90, 40, 70);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		for (student s : ts) {
			System.out.println(
					s.getName() + "--" + s.getCh() + "--" + s.getMath() + "--" + s.getEng() + "--" + s.getAll());
		}
	}
}

class student implements Comparable<student> {
	private String name;
	private int ch;
	private int math;
	private int eng;

	public student() {
	}

	public int getCh() {
		return ch;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	public student(String name, int ch, int math, int eng) {
		this.name = name;
		this.ch = ch;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getAll() {
		return ch + math + eng;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	/*
	 * 重写compareTo方法计算出的都是从小往大排列;
	 * 
	 * 如果想从大到小,请交换形参与this的位置(或者最后的参数变负号);
	 */
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		int tem = this.getAll() - o.getAll();
		// 总分相等不一定语文相等
		int tem2 = tem == 0 ? this.getCh() - o.getCh() : tem;
		// 语文相等不一定数学相等
		int tem3 = tem2 == 0 ? this.getMath() - o.getMath() : tem2;
		// 数学相等不一定英语相等
		int tem4 = tem3 == 0 ? this.getEng() - o.getEng() : tem3;
		// 所有的相等不一定姓名相等
		int tem5 = tem == 0 ? this.name.compareTo(o.name) : tem4;
		return tem5;
	}
}
