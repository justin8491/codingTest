package kr.co.dong.good;

import java.util.Scanner;

public class GoodsMenu {
	Scanner sc = new Scanner(System.in);

	public void displayMenu() {
		System.out.println("1.전체 상품 2.상품추가 3.상품검색 4.상품수정 5.상품삭제");
	}

	public String menuview() {
		return sc.next();
	}

	public Bean add() {

		System.out.print("상품 이름 : ");
		String gname = sc.nextLine();
		System.out.print("상품 내용 : ");
		String gcontent = sc.nextLine();
		System.out.print("상품 수량 : ");
		int gcnt = Integer.parseInt(sc.nextLine());
		System.out.print("상품 비고란 : ");
		String getc = sc.nextLine();

		return new Bean(gname, gcontent, gcnt, getc);
	}

	public int GoodsId() {
		System.out.print("상품 번호 입력 : ");
		return Integer.parseInt(sc.nextLine());
	}
}
