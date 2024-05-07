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
				System.out.println("회원 등록");
				break;
			case 2:
				System.out.println("게시글 생성");
//				System.out.print("게시글 번호 : ");
				boardNum++;
				System.out.print("게시글 제목 : ");
				title = sc.next();
//				writer = member.getName();
				System.out.print("게시글 내용 : ");
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
