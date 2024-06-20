/* 사용자가 요구하는 기능을 호출해서 처리 
 * 
 */
package kr.co.dong.good2;

import java.util.List;

public class GoodsControl {
	GoodServiceImp gservice = new GoodServiceImp();
	GoodsMsg gmsg = new GoodsMsg();

//	 1. 목록 전체 조회
	public void listAll() {
		List<Bean> list = gservice.listAll();
		
		if (list.isEmpty()) {
			System.out.println("조회 정보가 없습니다.");
		} else {
			gmsg.goodsViewAll(list);
		}
	}

//	2. 상품추가  (추가정보입력부분)
	public void insert(Bean g) {
		int r = gservice.insert(g);

		if (r > 0) {
			System.out.println("상품 정보 추가 완료");
		} else {
			gmsg.goodErrorMsg("insert");
		}
	}

//	3. 상품 수정
	public void update(Bean gnext, int gid) {
		Bean gp = gservice.selectOne(gid);

		if (gp == null) { // 없으면 되돌아가~~
			gmsg.goodErrorMsg("selectOne");
			return;
		}

		gmsg.goodsView(gp);

		gnext.setGid(gid);
		int r = gservice.update(gnext);

		if (r > 0) {
			System.out.println("상품 정보 수정 완료");
		} else {
			gmsg.goodErrorMsg("update");
		}
	}

//	4. 상품번호 gid로 상품 조회
	public void selectOne(int gid) {
		Bean g = gservice.selectOne(gid);

		if (g == null) {
			gmsg.goodErrorMsg("selectOne");
		} else {
			gmsg.goodsView(g);
		}
	}
	
	public static void main(String[] args) {
		
	}

}
