package study21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * ArrayList�д�Ÿ�ѧ����������ѧӢ��ɼ����ܷ�;
 * ��дcompareTo������������
 * ������������ArrayList�е����ݴ����ļ���
 * 		 
 * */
public class StudentsFileDemo {
	ArrayList<Students> al = new ArrayList<>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		StudentsFileDemo sfd = new StudentsFileDemo();
		BufferedWriter bw = new BufferedWriter(new FileWriter("Students.txt"));
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		Students s4 = new Students();
		Students s5 = new Students();
		sfd.al.add(sfd.setInfo(s1));
		sfd.al.add(sfd.setInfo(s2));
		sfd.al.add(sfd.setInfo(s3));
		sfd.al.add(sfd.setInfo(s4));
		sfd.al.add(sfd.setInfo(s5));
		Collections.sort(sfd.al);
		bw.write("����\t�ܷ�\t����\t��ѧ\tӢ��");
		for (Students s : sfd.al) {
			bw.newLine();
			bw.write(s.getName() + "\t" + s.getAll() + "\t" + s.getCh() + "\t" + s.getMath() + "\t" + s.getEng());
			bw.flush();
		}
		bw.close();

	}

	public Students setInfo(Students s) {
		System.out.println("������ѧ������:");
		s.setName(in.next());
		in.nextLine();
		System.out.println("�������ѧ�������ĳɼ� ��ѧ�ɼ� Ӣ��ɼ�");
		s.setCh(in.nextInt());
		s.setMath(in.nextInt());
		s.setEng(in.nextInt());
		s.setAll();
		return s;
	}
}
