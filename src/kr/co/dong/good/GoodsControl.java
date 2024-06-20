package kr.co.dong.good;

import java.util.Scanner;

public class GoodsControl {
	static Scanner sc = new Scanner(System.in);
	static GoodServiceImp gs = new GoodServiceImp();
	static GoodsMenu gm = new GoodsMenu();
	static GoodsMsg gMsg = new GoodsMsg();

	public static void main(String[] args) {
		boolean stop = false;
		String key = "";
		while (!stop) {
			gm.displayMenu();
			key = gm.menuview();
			switch (key) {
			case "1":
				// 전체 검색
				gMsg.goodsViewAll(gs.listAll());
				break;
			case "2":
				// 상품 추가
				gs.insert();
				break;
			case "3":
				// 상품 선택 검색
				gMsg.goodView(gs.selectOne());
				break;
			case "4":
				// 상품 수정
				gs.update();
				break;
			case "5":
				// 상품 삭제
				gs.delete(gm.GoodsId());
				break;
			case "6":
				// 시스템 종료
				break;
			}
		}
	}

}
