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
			System.out.println("1. 회원 등록 2.게시글 생성 3. 게시글 리스트");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("회원 등록");
				System.out.print("이름을 입력해 주세요 : ");
				name = sc.next();

				System.out.print("나이를 입력해 주세요 : ");
				age = sc.nextInt();
				System.out.print("성별을 입력해 주세요 : ");
				gender = sc.next().charAt(0);

				member = new Member(name, age, gender);
				writer = member.getName();
				System.out.println();

				break;
			case 2:
				if (member != null) {
					System.out.println("게시글 생성");
					boardNum += 1;
					System.out.println("게시글 번호 : " + boardNum);
					System.out.println("게시글 제목 : ");
					title = sc.next();
					System.out.println("게시글 내용 : ");
					content = sc.next();

					// 작성자
					board = new Board(boardNum, writer, title, content);

				} else {
					System.out.println("회원가입을 먼저 진행해주세요.");
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
