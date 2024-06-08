package kr.co.dong.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;

	public static Connection getConnection() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		// 2. 연결하기
		String url = "jdbc:mysql://localhost/SCOTT";
		String user = "root";
		String pwd = "1234";
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			System.out.println("에러 : " + e.getMessage());
			e.printStackTrace();
		}
		// 3. 쿼리 수행을 위한 Statement 객체 생성
		System.out.println("DB 연결");
		return conn;
	}
}
