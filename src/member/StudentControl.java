package member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentControl {
	Scanner sc = new Scanner(System.in);
	List<Student> students = new ArrayList<>(); // 학생정보를 담고 있는 리스트
	StudentExpel studentExpel = new StudentExpel(); // 삭제된 정보를 담고있는 클래스의 객체 생성
	Student etcStudent = new Student();
	String etc = "";

	// 초기값
	void init_a() {
		students.add(new Student("유빵빵", "28", "0611001", "컴퓨터"));
		students.add(new Student("김빵빵", "22", "0611002", "연기"));
		students.add(new Student("장빵빵", "23", "0611003", "경영"));
		students.add(new Student("윤빵빵", "24", "0611004", "항공"));
		students.add(new Student("박빵빵", "25", "0611005", "비서"));
	}

	// 기본 메뉴 출력메소드
	String menuView() {
		System.out.println("1. 추가, 2. 수정, 3. 삭제, 4. 보기, 기타. 종료");

		return sc.next(); // 입력된 데이터를 리턴
	}

	void studentPlay(String sel) {
		// 화면 메뉴출력 1. 추가 , 2. 수정, 3. 삭제, 4. 보기, 5. 종료, 기타
		switch (sel) {
		case "1": // 추가메소드()
			addStudent();
			break;
		case "2": // 수정메소드()
			updateView();
			break;
		case "3": // 삭제메소드()
			deleteStudent();
			break;
		case "4": // 보기메소드()
			studentView();
			break;
		case "5": // 종료메소드()
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
			break;

		}
	}

	// 보기 메소드
	void studentView() {
		// 1. 전체보기, 2. 학번검색, 3.삭제정보, 기타. 메뉴");
		System.out.println("1.전체보기, 2.학번검색, 3.삭제정보, ...기타. 메뉴");
		String key = sc.next();
		switch (key) {
		case "1":
			etcStudent.memberAllPrint(students);
			break;
		case "2":
			System.out.print("학번 입력 : ");
			etc = sc.next();
			etcStudent.memberNumPrint(searchStudents(etc), students);
			break;
		case "3":
			studentExpel.getExpelStudents();
			break;
		case "4":
			break;

		}
		for (Student st : students) {

		}
	}

	// 추가 메소드
	private void addStudent() {
		// 정보를 입력받아 students 배열에 추가
		System.out.println("학생 추가");
		System.out.print("학번 : ");
		String studentNum = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		String age = sc.next();
		System.out.print("전공 : ");
		String major = sc.next();
		students.add(new Student(name, age, studentNum, major));
	}

	// 수정 메인 메소드 : 학번으로 검색하고 있으면 수정메소드호출 없으면 재입력
	public void updateView() {
		int index;
		String studentNum = "";
		while (true) {
			System.out.print("[학생정보 수정] 학번을 입력하세요 : ");
			studentNum = sc.next();
			index = searchStudents(studentNum); // 학번으로 검색
			if (index >= 0) { // 인덱스값이 있다면
				// 수정
				if (updateStudent(index)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}

				break;
			} else {
				System.out.println("입력된 학번을 찾지 못했습니다. 다시 입력해주세요."); // 입력오류시 재입력
			}
		}
	}

	// 검색 메소드(학번 기준)
	int searchStudents(String studentNum) {
		int index = -1;
		for (int i = 0; i < students.size(); i++) {
			etcStudent = students.get(i);
			if (etcStudent.getStudentNum().equals(studentNum)) {
				index = i;
				break;
			}
		}
		return index; // 검색된 학생정보의 인덱스, 없다면 -1을 리턴
	}

	// 수정 메소드
	boolean updateStudent(int index) {
		// 수정할 항목 선택 [1. 이름] [2. 나이] [3. 학번] [4. 전공]

		boolean done = false;
		etcStudent = students.get(index);
		while (!done) {
			System.out.println("[1. 이름] [2. 나이] [3. 학번] [4. 전공] [5.뒤로가기]");
			String key = sc.next();
			switch (key) {
			case "1":
				System.out.println("수정할 이름 : ");
				etcStudent.setName(sc.next());

				break;
			case "2":
				System.out.println("수정할 나이 : ");
				etcStudent.setAge(sc.next());
				break;
			case "3":
				System.out.println("수정할 학번 : ");
				etcStudent.setStudentNum(sc.next());
				break;
			case "4":
				System.out.println("수정할 전공 : ");
				etcStudent.setMajor(sc.next());
				break;
			case "5":
				done = true;
				break;
			}
		}

		return done;
	}

	// 삭제 메소드
	void deleteStudent() {
		// [학생정보 삭제] 학번을 입력해주세요 :
		System.out.println("[학생정보 삭제]");
		System.out.print("학번을 입력해주세요 : ");
		etc = sc.next();

		if (searchStudents(etc) == -1) {
			System.out.println("조회되지 않는 학생입니다.");
		} else {
			studentExpel.addExpelStudents(students.get(searchStudents(etc)));
			students.remove(searchStudents(etc));

		}

	}

}
