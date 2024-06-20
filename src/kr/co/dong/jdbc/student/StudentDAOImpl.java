package kr.co.dong.jdbc.student;

import static kr.co.dong.jdbc.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAOImpl implements StudentDAOable {

	Connection conn = getConnection();
	static List<StudentVO> emp = new ArrayList<StudentVO>();
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	StudentVO std = new StudentVO();

	@Override
	public int createStudent(int result, Scanner sc) {
		System.out.println("학생 추가");

		try {
			System.out.println("학년 : ");
			int s_dept = sc.nextInt();
			System.out.println("나이 : ");
			int s_age = sc.nextInt();
			System.out.println("이름 : ");
			String s_name = sc.next();
			System.out.println("전공 : ");
			String s_major = sc.next();
			std.setS_dept(s_dept);
			std.setS_age(s_age);
			std.setS_name(s_name);
			std.setS_major(s_major);

			pstmt = conn.prepareStatement("insert into student value(?,?,?,?,?)");
			pstmt.setInt(1, 0);
			pstmt.setInt(2, std.getS_dept());
			pstmt.setInt(3, std.getS_age());
			pstmt.setString(4, std.getS_name());
			pstmt.setString(5, std.getS_major());

			result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("학생 추가 완료!");
			} else {
				System.err.println("학생 추가 실패!");
			}
		} catch (SQLException e) {
			System.out.println("폭망");
			e.printStackTrace();
		} finally {
			close(pstmt);
			std = new StudentVO();
		}

		return result;
	}

	@Override
	public int updateStudent(int result, Scanner sc) {
		System.out.println("학생 수정");
		System.out.print("수정 할 학생 학번을 입력 : ");
		int s_no = sc.nextInt();
		System.out.println("수정 학년 : ");
		int s_dept = sc.nextInt();
		System.out.println("수정 나이 : ");
		int s_age = sc.nextInt();
		System.out.println("수정 전공 : ");
		String s_major = sc.next();

		std.setS_no(s_no);
		std.setS_dept(s_dept);
		std.setS_age(s_age);
		std.setS_major(s_major);
		try {
			pstmt = conn.prepareStatement("update student set s_dept = ?, s_age = ?, s_major = ? where s_no = ?");

			pstmt.setInt(1, std.getS_dept());
			pstmt.setInt(2, std.getS_age());
			pstmt.setString(3, std.getS_major());
			pstmt.setInt(4, std.getS_no());

			result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("학생 수정 완료!");
			} else {
				System.err.println("학생 수정 실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			std = new StudentVO();
		}
		return result;
	}

	@Override
	public int deleteStudent(int result, Scanner sc) {
		System.out.println("학생 삭제");
		System.out.println("삭제 학번 : ");
		int s_no = sc.nextInt();
		System.out.println("삭제 이름 : ");
		String s_name = sc.next();

		std.setS_no(s_no);
		std.setS_name(s_name);
		try {
			pstmt = conn.prepareStatement("DELETE FROM student WHERE s_no = ? AND s_name = ?");
			pstmt.setInt(1, std.getS_no());
			pstmt.setString(2, std.getS_name());

			result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("학생 삭제 완료!");
			} else {
				System.err.println("학생 삭제 실패!");
			}
		} catch (SQLException e) {
			System.out.println("해줘~~~");
			e.printStackTrace();
		} finally {
			close(pstmt);
			std = new StudentVO();
		}
		return result;
	}

	@Override
	public List<StudentVO> searchStudent() {

		try {
			System.out.println("전체 검색");
			emp = new ArrayList<StudentVO>();

			pstmt = conn.prepareStatement("select * from student");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				emp.add(new StudentVO(rs.getInt("s_no"), rs.getInt("s_dept"), rs.getInt("s_age"),
						rs.getString("s_name"), rs.getString("s_major")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		for (StudentVO stu : emp) {
			System.out.println(stu);
		}
		return emp;
	}

	public List<StudentVO> searchStudentTest() {
		try {
			System.out.println("전체 검색");
			emp = new ArrayList<StudentVO>();

			pstmt = conn.prepareStatement("select * from student");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				emp.add(new StudentVO(rs.getInt("s_no"), rs.getInt("s_dept"), rs.getInt("s_age"),
						rs.getString("s_name"), rs.getString("s_major")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		for (StudentVO stu : emp) {
			System.out.println(stu);
		}
		return emp;
	}

	@Override
	public StudentVO searchStudentOne(Scanner sc) {
		System.out.println("선택 검색");
		emp = new ArrayList<StudentVO>();
		System.out.print("나이 입력 : ");
		String s_age = sc.next();
		System.out.println("이름 입력 : ");
		String s_name = sc.next();
		try {
			pstmt = conn.prepareStatement("select * from student where s_age = ? and s_name = ?");
			pstmt.setString(1, s_age);
			pstmt.setString(2, s_name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				std = new StudentVO(rs.getInt("s_no"), rs.getInt("s_dept"), rs.getInt("s_age"), rs.getString("s_name"),
						rs.getString("s_major"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		System.out.println(std);

		return std;
	}

	public StudentVO searchStudentOneTest(int s_no) {
		// TODO Auto-generated method stub
		System.out.println("선택 검색");
		emp = new ArrayList<StudentVO>();
//		System.out.print("나이 입력 : ");
//		String s_age = sc.next();
//		System.out.println("이름 입력 : ");
//		String s_name = sc.next();
		try {
			pstmt = conn.prepareStatement("select * from student where s_no = ?");
			pstmt.setInt(1, s_no);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				std = new StudentVO(rs.getInt("s_no"), rs.getInt("s_dept"), rs.getInt("s_age"), rs.getString("s_name"),
						rs.getString("s_major"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		System.out.println(std);

		return std;
	}

	public void exitSystem() {
		close(conn);
		close(pstmt);
		close(rs);
	}

}
