package kr.co.dong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectTest {

	public static void main(String[] args) {
	      Connection conn = null;
	      
	      try {
//	      구동드라이브 연결
	         Class.forName("com.mysql.cj.jdbc.Driver");
//	      Class.forName("com.mysql.jdbc.Driver"); 6이하버전
//	      Class.forName("oracle.jdbc.driver.OracleDriver"); 오라클일때
	            
//	         접속하기
	         String url = "jdbc:mysql://localhost/mydb";
	         String user ="root";
	         String password ="12345678";
	         
	         conn = DriverManager.getConnection(url, user, password);
	         System.out.println("연결 성공!!!!");
	         
	      } catch (ClassNotFoundException cnfe) {
	         // TODO Auto-generated catch block
	         cnfe.printStackTrace();
	         System.out.println("연결 드라이브가 없습니다.");
	      } catch (SQLException sqle) {
	         // TODO Auto-generated catch block
	         sqle.printStackTrace();
	         System.out.println("에러 : ");
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
