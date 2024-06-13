package kr.co.dong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * scott 테이블의 전체사원 을 조회한 후
 * 콘솔에 출력해 보기
 */
public class SelectAllTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/SCOTT";
			String user = "root";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, user, pwd);
			String sql = "SELECT * FROM EMP";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("사원번호 : " + rs.getString("EMPNO") + " 사원이름 : " + rs.getString("ENAME") + " 직업 : "
						+ rs.getString("JOB") + " 사수번호 : " + rs.getString("MGR") + " 입사일 : " + rs.getString("HIREDATE")
						+ " 연봉 : " + rs.getString("SAL"));
			}

//			System.out.println("DB 연동 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연동 실패");
		}
	}

}
