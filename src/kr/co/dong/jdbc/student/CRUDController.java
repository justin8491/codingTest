package kr.co.dong.jdbc.student;

import static kr.co.dong.jdbc.JDBCTemplate.*;

import java.sql.SQLException;
import java.util.Scanner;

public class CRUDController {
	static Scanner sc = new Scanner(System.in);
	static StudentDAOImpl dao = new StudentDAOImpl();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		boolean stop = false;
		int result = 0;

		while (!stop) {
			String key = menuView();

			switch (key) {
			case "1":
				// 추가
				createStudent(result);
				break;
			case "2":
				// 수정
				updateStudent(result);
				break;
			case "3":
				// 삭제
				deleteStudent(result);
				break;
			case "4":
				// 검색
				searchStudent(key);
				break;
			case "5":
				// 검색
				exitSystem();
				sc.close();
				stop = true;
				System.out.println("시스템 종료");
				break;
			case "6":
				System.out.println(dao.std);
				break;
			}
		}

	}

	private static String menuView() {
		System.out.println("1. 추가 2. 수정 3. 삭제 4. 찾기 5. 종료");
		return sc.next();
	}

	private static void exitSystem() {
		dao.exitSystem();
	}

	private static void searchStudent(String key) {
		System.out.println("1.전체 검색 2.선택 검색");
		key = sc.next();
		switch (key) {
		case "1":
			// 전체
			dao.searchStudent();
			break;
		case "2":
			// 선택
			dao.searchStudentOne(sc);
			break;
		}

	}

	private static void deleteStudent(int result) {
		dao.deleteStudent(result, sc);
	}

	private static void updateStudent(int result) {
		dao.updateStudent(result, sc);
	}

	private static void createStudent(int result) {
		dao.createStudent(result, sc);
	}

}
