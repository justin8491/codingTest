package kr.co.dong.jdbc;

import java.util.Scanner;

import kr.co.dong.jdbc.student.StudentDAOImpl;
import kr.co.dong.jdbc.student.StudentVO;

public class EmpTestUnit {
	public static void main(String[] args) {
		StudentDAOImpl dao = new StudentDAOImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("사원 전체목록 조회");

		dao.searchStudentTest();

		System.out.println("List Test End!!");

		// 학생번호에 의한 조회
		int s_no = 6;
		StudentVO std = dao.searchStudentOneTest(s_no);
	}
}
