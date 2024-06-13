/*	멤버필드는 모두 String으로 작성하기
	name;
	age;
	studentNum;
	major;
*/
package member;

import java.util.List;

public class Student {

	private String name;
	private String age;
	private String studentNum;
	private String major;

	public Student() {
	}

	public Student(String name, String age, String studentNum, String major) {
		super();
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
		this.major = major; // 전공
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentNum=" + studentNum + ", major=" + major + "]";
	}

	public void memberAllPrint(List<Student> st) {
		for (Student stc : st) {
			System.out.println("학번 :" + stc.studentNum + " 이름 :" + stc.name + " 나이:" + stc.age + " 전공:" + stc.major);
		}
	}

	public void memberNumPrint(int index, List<Student> st) {
		System.out.println("학번 :" + st.get(index).studentNum + " 이름 :" + st.get(index).name + " 나이:" + st.get(index).age
				+ " 전공:" + st.get(index).major);
	}

}
