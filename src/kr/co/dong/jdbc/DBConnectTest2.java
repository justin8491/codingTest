package kr.co.dong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectTest2 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 데이터베이스 접속시 생길 수 있는 오류
//	 	1. 구동 드라이브 유무
//		2. SQL 오류(연결/질의문)
//		3. 데이터베이스 접속 아이디 비번 오류

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			데이터베이스 접속하기 위한 정보제공
			String url = "jdbc:mysql://localhost/scott";
			String user = "root";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결");
		} catch (ClassNotFoundException e) {
			System.out.println("구동드라이브가 없습니다.");
			System.out.println("예외 에러 : " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패");

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
