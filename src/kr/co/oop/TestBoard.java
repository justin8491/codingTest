package kr.co.oop;

import java.util.Scanner;

public class TestBoard {
	public static void main(String[] args) {

		int boardNum = 1;
		String title;
		String writer;
		String content;

		Scanner sc = new Scanner(System.in);
		
		Member member;
		
		Board board;
		BoardList boardList = new BoardList();

		int key = sc.nextInt();
		boolean stop = false;

		while (!stop) {
			switch (key) {
			case 1:
				System.out.println("ȸ�� ���");
				break;
			case 2:
				System.out.println("�Խñ� ����");
//				System.out.print("�Խñ� ��ȣ : ");
				boardNum++;
				System.out.print("�Խñ� ���� : ");
				title = sc.next();
//				writer = member.getName();
				System.out.print("�Խñ� ���� : ");
				content = sc.next();
				break;
			case 3:

				break;
			case 4:

				break;

			}
		}

	}

}
