package kr.co.dong.good2;

import java.util.List;

public class GoodsMsg {
//	처리결과에 대한 출력문 작성	
	public void goodErrorMsg(String msg) {
		switch(msg) {
		case "insert":
			System.out.println("상품정보 추가 실패");
			break;
		case "update":
			System.out.println("상품 정보 수정 실패");
			break;
		case "selectOne":  //selectById
			System.out.println("상품 정보가 없습니다.");
			break;
		case "delete":
			System.out.println("상품 정보 삭제 실패");
			break;
		default:
			System.out.println("오류를 찾을 수 없습니다.");
		
		}		
	}
	
	public void goodsViewAll(List<Bean> list) {
		System.out.println(">====== 상품 전체 목록 조회 =====");
		for(Bean g : list) {
			System.out.println(g);
		}
	}
	
	public void goodsView(Bean g) {
		System.out.println(">==== 상품 조회 =====");
		System.out.println(g);
	}

}










