import java.util.*;

public class denglu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "327739288";
		String password = "ww327739288";
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入用户名:");
			String name1 = in.next();
			System.out.println("请输入密码:");
			String password1 = in.next();
			int tem = 3 - i;
			if (name1.equals(name) == true && password1.equals(password) == true) {
				System.out.println("登陆成功!");
				break;
			}
			if (tem == 0) {
				System.out.println("机会使用完,等稍后再试");
			} else {
				System.out.println("输入错误,请重新输入,您还有" + tem + "次机会");
			}
		}
		in.close();
	}
}
