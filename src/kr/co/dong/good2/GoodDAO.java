package kr.co.dong.good2;

import java.util.List;

public interface GoodDAO {
	List<Bean> listAll();

	int insert();

	int update();

	Bean selectOne();

	int delete(int gid);

}
