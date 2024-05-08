package kr.co.oop;

import java.util.Scanner;

public class TestBoard {
	public static void main(String[] args) {

		Scanner sc;

		Member member = null;
		String name = "";
		int age = 0;
		char gender = ' ';

		Board board = null;
		int boardNum = 0;
		String title = "";
		String writer = "";
		String content = "";

		BoardList boardList = new BoardList();

		int key = 0;
		boolean stop = false;

		while (!stop) {
			sc = new Scanner(System.in);
			System.out.println("1. ȸ�� ��� 2.�Խñ� ���� 3. �Խñ� ����Ʈ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("ȸ�� ���");
				System.out.print("�̸��� �Է��� �ּ��� : ");
				name = sc.next();

				System.out.print("���̸� �Է��� �ּ��� : ");
				age = sc.nextInt();
				System.out.print("������ �Է��� �ּ��� : ");
				gender = sc.next().charAt(0);

				member = new Member(name, age, gender);
				writer = member.getName();
				System.out.println();

				break;
			case 2:
				if (member != null) {
					System.out.println("�Խñ� ����");
					boardNum += 1;
					System.out.println("�Խñ� ��ȣ : " + boardNum);
					System.out.println("�Խñ� ���� : ");
					title = sc.next();
					System.out.println("�Խñ� ���� : ");
					content = sc.next();

					// �ۼ���
					board = new Board(boardNum, writer, title, content);

				} else {
					System.out.println("ȸ�������� ���� �������ּ���.");
				}

				break;
			case 3:
				boardList.boardListPrint(board);
				break;
			case 4:

				break;

			}
		}

	}

}
