package kr.co.dong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class DBSelectOneTest {

	public static void main(String[] args) {
//		사원명으로 검색해서 해당사원의 정보를 출력하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmpBean> emp = new ArrayList<EmpBean>();
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/SCOTT";
			String user = "root";
			String pwd = "1234";
			String name = "";
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결\n");

			while (!name.equals("qq")) {
				emp = null;
				emp = new ArrayList<EmpBean>();
				System.out.println("===============================================");
				System.out.print("찾을 사원 이름이나 알파벳을 입력해주세요 : ");
				name = sc.nextLine() + "%";

				pstmt = conn.prepareStatement("select * from emp where ename = ? OR ename like ?");
				pstmt.setString(1, name);
				pstmt.setString(2, name);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					emp.add(new EmpBean(rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("JOB"),
							rs.getString("MGR"), rs.getString("HIREDATE"), rs.getDouble("SAL"), rs.getDouble("COMM"),
							rs.getInt("DEPTNO")));
				}

				for (EmpBean e2 : emp) {
					System.out.println(e2);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
