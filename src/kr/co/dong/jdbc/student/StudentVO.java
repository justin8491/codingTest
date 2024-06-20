package kr.co.dong.jdbc.student;

/*
 * 스키마 : testdb
 * 테이블 : student
 * - 학생id, 학생명, 학년, 나이, 학과를 만들어서
 * 메뉴를 구성합시니다.
 */

public class StudentVO {
	private int s_no;
	private int s_dept;
	private int s_age;
	private String s_name;
	private String s_major;

	public StudentVO() {
	}

	public StudentVO(int s_no, int s_dept, int s_age, String s_name, String s_major) {
		super();
		this.s_no = s_no;
		this.s_dept = s_dept;
		this.s_age = s_age;
		this.s_name = s_name;
		this.s_major = s_major;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public int getS_dept() {
		return s_dept;
	}

	public void setS_dept(int s_dept) {
		this.s_dept = s_dept;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_major() {
		return s_major;
	}

	public void setS_major(String s_major) {
		this.s_major = s_major;
	}

	@Override
	public String toString() {
		return "StudentVO [학번=" + s_no + ", 학년=" + s_dept + ", 나이=" + s_age + ", 이름=" + s_name + ", 전공=" + s_major
				+ "]";
	}

}
