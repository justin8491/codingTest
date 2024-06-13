package kr.co.dong.dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Member> userList = new ArrayList<Member>(); // 임시 데이터베이스
	static Member sessionUser; // 현재 로그인 사용자
	static boolean isLogin = false;

	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		conn = DBConnection.getConnection();
		process();

	}

	private static void process() throws SQLException {
		Member selectUser = null;
		int key = 0;
		while (true) {
			if (!isLogin) {
				key = keyInfo(key);
				switch (key) {
				case 1:
					// 로그인
					login(selectUser);
					break;
				case 2:
					// 회원가입
					signUp(selectUser);
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

	static void myInfo(Member stionUser) {
		System.out.println("=====================");
		System.out.println("아이디 : " + stionUser.getUid());
		System.out.println("비밀번호 : " + stionUser.getPwd());
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

	static void login(Member selectUser) throws SQLException {
		System.out.print("아이디를 입력 해 주세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력 해 주세요 : ");
		String pwd = sc.next();

		sessionUser = userCheck(id, pwd, selectUser);
		if (sessionUser != null) {
			isLogin = true;
		} else {
			isLogin = false;
			System.out.println("로그인 실패");
		}

	}

	static Member userCheck(String id, String pwd, Member selectUser) throws SQLException {
		stmt = conn.createStatement();
		// 4. SQL 쿼리 작성
		String sql = "SELECT * FROM MEMBERS WHERE UID = '" + id + "' AND PWD = '" + pwd + "'";
		// 5. 쿼리 수행
		rs = stmt.executeQuery(sql);
		// 6. 실행결과 출력하기
		while (rs.next()) {
			selectUser = new Member(rs.getString("UID"), rs.getString("PWD"), rs.getString("NAME"),
					rs.getString("GENDER"), rs.getString("EMAIL"));
		}
		return selectUser;
	}

	static void signUp(Member selectUser) {
		System.out.print("아이디를 입력 해 주세요 : ");
		String uid = sc.next();
		System.out.print("비밀번호를 입력 해 주세요 : ");
		String pwd = sc.next();
		System.out.print("이름을 입력 해 주세요 : ");
		String name = sc.next();
		System.out.print("성별을 입력 해 주세요 : ");
		String gender = sc.next();
		System.out.print("이메일을 입력 해 주세요 : ");
		String email = sc.next();

		try {
			pstmt = conn.prepareStatement("select * from MEMBERS where uid = ?");
			pstmt.setString(1, uid);
			pstmt.executeQuery();
			try {
				while (rs.next()) {
					selectUser = new Member(rs.getString("UID"), rs.getString("PWD"));
				}
			} catch (NullPointerException e) {
				System.err.println("이미 존재하는 아이디 입니다.");
			}
		} catch (SQLException e) {
			System.out.println("처음으로 돌아갑니다.");
		}

		int result = 0;

		try {
			pstmt = conn.prepareStatement("INSERT INTO MEMBERS VALUES(?,?,?,?,?)");
			pstmt.setString(1, uid);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, gender);
			pstmt.setString(5, email);
			result = pstmt.executeUpdate();
			System.out.println("Result : " + result);
		} catch (SQLException e) {
			System.out.println("처음으로 돌아갑니다.");
		}

		if (result == 1) {
			System.out.println("회원가입 성공");
		} else {
			System.err.println("회원가입 실패");
		}
		System.out.println();

//		userList.add(user);
	}

}