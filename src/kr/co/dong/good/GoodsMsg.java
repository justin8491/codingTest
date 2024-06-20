package kr.co.dong.good;

import java.sql.SQLException;
import java.util.List;

public class GoodsMsg {

	void goodErrorMsg(SQLException e) {

		int errorCode = e.getErrorCode();
		String sqlState = e.getSQLState();

		switch (errorCode) {
		case 1049:
			System.out.println("[" + errorCode + "] 데이터베이스를 찾을 수 없습니다.");
			break;
		case 1062:
			System.out.println("중복된 키 오류: " + e.getMessage());
			break;
		case 1045:
			System.out.println("접속 권한 오류: " + e.getMessage());
			break;
		default:
			System.out.println("SQL 예외 발생: " + e.getMessage() + " (SQLState: " + sqlState + ")");
			break;

		}
		System.out.println("오류입니다. 관리자에게 문의하세요.");

	}

	void goodsViewAll(List<Bean> b) {
		for (Bean good : b) {
			System.out.println("============================");
			System.out.println("상품 아이디 : " + good.getGid() + " 상품 이름 : " + good.getGname());
			System.out.println("상품 내용ㅁ : " + good.getGcontent());
			System.out.println("상품 수량ㅁ : " + good.getGcnt());
			 System.out.println("상품 비고란 : " + good.getGetc());
			System.out.println("============================");
		}
	}

	void goodView(Bean good) {
		System.out.println("============================");
		System.out.println("상품 아이디 : " + good.getGid() + " 상품 이름 : " + good.getGname());
		System.out.println("상품 내용ㅁ : " + good.getGcontent());
		System.out.println("상품 수량ㅁ : " + good.getGcnt());
		System.out.println("상품 비고란 : " + good.getGetc());
		System.out.println("============================");
	}
}
