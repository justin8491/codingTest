
package kr.co.dong.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<User> userList = new ArrayList<User>(); // 임시 데이터베이스
	static User sessionUser; // 현재 로그인 사용자
	static boolean isLogin = false;

	public static void main(String[] args) {
		int key = 0;
		while (true) {
			if (!isLogin) {
				key = keyInfo(key);
				switch (key) {
				case 1:
					// 로그인
					login();
					break;
				case 2:
					// 회원가입
					signUp();
					break;
				}
			} else {
				key = loginKeyInfo(key);
				switch (key) {
				case 1:
					// 내정보 확인
					myInfo(sessionUser);
					break;
				case 2:
					// 로그아웃
					logout();
					break;
				}
			}

		}

	}

	static void logout() {
		sessionUser = null;
		isLogin = false;
	}

	static void myInfo(User stionUser) {
		System.out.println("=====================");
		System.out.println("아이디 : " + stionUser.getId());
		System.out.println("비밀번호 : " + stionUser.getPwd());
		System.out.println("이름 : " + stionUser.getName());
		System.out.println("=====================");

	}

	static int keyInfo(int key) {
		System.out.println("=======================");
		System.out.println("1.로그인 2.회원가입");
		System.out.println("=======================");
		System.out.print("선택 번호 : ");
		return sc.nextInt();

	}

	static int loginKeyInfo(int key) {
		System.out.println("=======================");
		System.out.println("1.내 정보 확인 2.로그아웃");
		System.out.println("=======================");
		System.out.print("선택 번호 : ");
		return sc.nextInt();

	}

	static void login() {
		System.out.print("아이디를 입력 해 주세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력 해 주세요 : ");
		String pwd = sc.next();
		sessionUser = userCheck(id, pwd);
		if (sessionUser != null) {
			isLogin = true;
		} else {
			isLogin = false;
			System.out.println("로그인 실패");
		}

	}

	static User userCheck(String id, String pwd) {
		for (Object user : userList) {
			User saveUser = (User) user;
			if (saveUser.getId().equals(id) && saveUser.getPwd().equals(pwd)) {
				System.out.println("로그인 성공 " + saveUser.getName() + "님 환영합니다.");
				return saveUser;
			} else {
				System.out.println("로그인 실패. 관리자에게 문의하세요.");
				return null;
			}
//			else if (saveUser.getId().equals(id) && !(saveUser.getPwd().equals(pwd))) {
//				System.out.println("비밀번호가 틀립니다. 다시 로그인 시도 요망.");
//			} else {
//				System.out.println("로그인 실패. 관리자에게 문의하세요.");
//			}
		}
		return null;
	}

	static void signUp() {
		System.out.print("아이디를 입력 해 주세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력 해 주세요 : ");
		String pwd = sc.next();
		System.out.print("이름 입력 해 주세요 : ");
		String name = sc.next();
		User user = new User(id, pwd, name);
		userList.add(user);
	}

}
