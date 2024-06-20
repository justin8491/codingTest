package kr.co.dong.good2;

import java.util.List;

public interface GoodService {
	List<Bean> listAll();

	int insert();

	void update();

	Bean selectOne();

	void delete(int gid);

}
