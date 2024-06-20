package kr.co.dong.jdbc;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class DBInsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		System.out.println(now);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/SCOTT";
			String user = "root";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, user, pwd);
			System.out.print("사원번호 : ");
			String empno = sc.next();
			System.out.print("사원이름 : ");
			String ename = sc.next();
			System.out.print("직무 : ");
			String job = sc.next();
			System.out.print("사수번호 : ");
			String mgr = sc.next();

			String hiredate = now + "";
			System.out.print("연   봉 : ");
			String sal = sc.next();
			System.out.print("추가수당 : ");
			String comm = sc.next();
			System.out.print("부서번호(10~40) : ");
			String dept = sc.next();

			pstmt = conn.prepareStatement("insert into emp value(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setString(4, mgr);
			pstmt.setString(5, hiredate);
			pstmt.setString(6, sal);
			pstmt.setString(7, comm);
			pstmt.setString(8, dept);
			System.out.println("=====================================");
			System.out.println("		사원정보");
			System.out.println("사번:" + empno + " 이름:" + ename + " 직무:" + job + " 사수:" + mgr);
			System.out.println("입사일:" + hiredate + " 연봉:" + sal + " 커미션:" + comm);
			System.out.println("부서번호:" + dept);
			System.out.println("=====================================");
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("정보 삽입 성공");
			} else {
				System.out.println("정보 삽입 실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
