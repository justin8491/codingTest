package kr.co.dong.jdbc.student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface StudentDAOable {
	// 추가
	public int createStudent(int result, Scanner sc);

	// 수정
	public int updateStudent(int result, Scanner sc);

	// 삭제
	public int deleteStudent(int result, Scanner sc);

	// 검색
	public List<StudentVO> searchStudent();

	// 선택 검색
	public StudentVO searchStudentOne(Scanner sc);
}
