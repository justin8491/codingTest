package kr.co.control;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		/*
		 * 1명의 학생 성적을 콘솔로 받아서 출력 예 ) 학생 점수는 77이고 학점은 C입니다
		 */
		Scanner sc = new Scanner(System.in);
		int grade = 0;

		System.out.print("학점을 입력해 주세요  : ");

		grade = Integer.parseInt(sc.nextLine());

		if (grade >= 90) {
			System.out.println("학생의 점수는 " + grade + "이고, 학점은 A 입니다");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("학생의 점수는 " + grade + "이고, 학점은 B 입니다");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("학생의 점수는 " + grade + "이고, 학점은 C 입니다");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("학생의 점수는 " + grade + "이고, 학점은 D 입니다");
		} else {
			System.out.println("학생의 점수는 " + grade + "이고, 학점은 F 입니다");
		}

	}

}
