package kr.co.dong.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTemplate {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 연결하기
			String url = "jdbc:mysql://localhost/testdb";
			String user = "root";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException sql) {
			System.out.println("DB 연결 실패");
			System.out.println("에러 : " + sql.getMessage());
			sql.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 3. 쿼리 수행을 위한 Statement 객체 생성
		System.out.println("DB 연결");
		return conn;
	}

//	close() -> conn/ stmt/pstmt/rs
	public static void close(Connection conn) {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
	}

	public static void close(PreparedStatement pstmt) {
		try {
			if (pstmt != null && !pstmt.isClosed())
				pstmt.close();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed())
				rs.close();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
	}

//	commit/rollback
	public static void commit(Connection conn) {
		try {
			if (conn != null && !conn.isClosed())
				conn.commit();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
	}

}
