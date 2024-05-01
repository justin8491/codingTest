package kr.co.control;

import java.util.Scanner;

public class StringTest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int temp = -1;
		int idx = -1;
		int num = 0;
		int cnt = 0;
		char search = ' ';
		String str = "";

		String content = "This classic romance focuses on Elizabeth Bennet,"
				+ " one of five sisters, as she navigates societal expectations and misunderstandings."
				+ " When the wealthy Mr. Darcy enters her life,"
				+ " their initial pride and prejudice towards each other evolve into a deep and genuine love.";

		System.out.println("1.문자 찾기 2.문자열 찾기");

		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.print("찾을 문자 입력 : ");
			search = sc.next().charAt(0);

			for (int i = 0; i < content.length(); i++) {
				if (search == content.charAt(i)) {
					cnt++;
				}
			}
			System.out.println("입력한'" + search + "'의 갯수는" + cnt + " 개 입니다.");
			break;
		case 2:
			System.out.println("찾을 문자열 입력 : ");
			str = sc.next();
			for (int i = temp; i < content.length(); i++) {
				idx = content.indexOf(str, temp + 1);
				if (idx != -1 && temp != idx) {
					temp = idx;
					cnt++;
				}
			}
			System.out.println("입력한'" + str + "'의 갯수는 " + cnt + " 개 입니다.");
			break;

		default:
			break;
		}

	}
}
