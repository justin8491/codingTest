package kr.co.dong.good2;

import java.util.ArrayList;
import java.util.List;

public class GoodServiceImp implements GoodService {

	GoodDAOimp gsDAO = new GoodDAOimp();
	List<Bean> goodList = new ArrayList<Bean>();

	@Override
	public List<Bean> listAll() {
		return goodList = gsDAO.listAll();
	}

	@Override
	public int insert() {
		return gsDAO.insert();
	}

	@Override
	public void update() {
		if (gsDAO.update() == 1) {
			System.out.println("상품수정 성공");
		} else {
			System.err.println("상품수정 실패");
		}

	}

	@Override
	public Bean selectOne() {
		return gsDAO.selectOne();
	}

	@Override
	public void delete(int gid) {
		if (gsDAO.delete(gid) == 1) {
			System.out.println("상품삭제 성공");
		} else {
			System.err.println("상품삭제 실패");
		}

	}

}
