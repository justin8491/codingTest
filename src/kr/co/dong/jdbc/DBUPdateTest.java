package kr.co.dong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBUPdateTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/SCOTT";
			String user = "root";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, user, pwd);

			pstmt = conn.prepareStatement("UPDATE EMP SET ENAME = ? WHERE ENAME = ?");

			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("바꿀 이름 입력 : ");
			String changeName = sc.next();

			pstmt.setString(1, changeName);
			pstmt.setString(2, name);

			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("바뀌었다 응애");
			} else {
				System.out.println("실패다 응애");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
