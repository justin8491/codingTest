package kr.co.dong.user;

import java.util.List;

public interface UserDAO {
	List<User> listAllUser();

	void findGetById();

	void findGetByPwd();

	int createUser(User user);

	int updateUser(User user);

	int deleteUser(String id);
}
