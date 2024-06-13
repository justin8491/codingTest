package kr.co.dong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * scott 테이블의 전체사원 을 조회한 후
 * 콘솔에 출력해 보기
 */
public class SelectAllTest3 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<DeptVO> emp = new ArrayList<DeptVO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/SCOTT";
			String user = "root";
			String pwd = "1234";
			conn = DriverManager.getConnection(url, user, pwd);
//			String ename = "S%";
			pstmt = conn.prepareStatement("SELECT * FROM DEPT WHERE loc = ?");
			pstmt.setString(1,"new york");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				emp.add(new DeptVO(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC")));
			}

			for (DeptVO e2 : emp) {
				System.out.println(e2);
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
