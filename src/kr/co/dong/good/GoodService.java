package kr.co.dong.good;

import java.util.List;

public interface GoodService {
	List<Bean> listAll();

	void insert();

	void update();

	Bean selectOne();

	void delete(int gid);

}
