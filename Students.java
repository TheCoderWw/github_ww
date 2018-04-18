package study21;

public class Students implements Comparable<Students> {
	private String name;
	private int Ch;
	private int Math;
	private int Eng;
	private int All;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCh() {
		return Ch;
	}

	public void setCh(int ch) {
		Ch = ch;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public void setAll() {
		this.All = this.Ch + this.Math + this.Eng;
	}

	public int getAll() {
		return All;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		int tem = this.getAll() - o.getAll();
		int tem1 = (tem == 0) ? this.getCh() - o.getCh() : tem;
		int tem2 = (tem1 == 0) ? this.getMath() - o.getMath() : tem1;
		int tem3 = (tem2 == 0) ? this.getEng() - o.getEng() : tem2;
		int tem4 = (tem3 == 0) ? this.getName().compareTo(o.getName()) : tem3;
		return -tem4;
	}

}
