import java.util.*;

public class denglu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "327739288";
		String password = "ww327739288";
		for (int i = 1; i <= 3; i++) {
			System.out.println("�������û���:");
			String name1 = in.next();
			System.out.println("����������:");
			String password1 = in.next();
			int tem = 3 - i;
			if (name1.equals(name) == true && password1.equals(password) == true) {
				System.out.println("��½�ɹ�!");
				break;
			}
			if (tem == 0) {
				System.out.println("����ʹ����,���Ժ�����");
			} else {
				System.out.println("�������,����������,������" + tem + "�λ���");
			}
		}
		in.close();
	}
}
