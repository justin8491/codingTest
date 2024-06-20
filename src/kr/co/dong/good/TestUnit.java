package kr.co.dong.good;

import java.util.ArrayList;
import java.util.List;

public class TestUnit {

	public static void main(String[] args) {

		GoodDAOimp dao = new GoodDAOimp();
		List<Bean> list = new ArrayList<Bean>();

		list = dao.listAll();

		for (Bean good : list) {
			System.out.println(good);
		}

		Bean goods = new Bean();

		goods = dao.selectOne();

		System.out.println(goods);

	}

}
