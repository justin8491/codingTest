package kr.co.control;

import java.util.Scanner;

public class IfTest02_1 {

	public static void main(String[] args) {
		/*
		 * 1명의 학생 성적을 콘솔로 받아서 출력 예 ) 학생 점수는 77이고 학점은 C입니다
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;
		char grade = ' ';

		System.out.print("학점을 입력해 주세요  : ");

		score = Integer.parseInt(sc.nextLine());

		if (score >= 90) {
			grade = 'A';
			System.out.println("학생의 점수는 " + score + "이고, 학점은 " + grade + " 입니다");
		} else if (score >= 80 && score < 90) {
			grade = 'B';
			System.out.println("학생의 점수는 " + score + "이고, 학점은 " + grade + " 입니다");
		} else if (score >= 70 && score < 80) {
			grade = 'C';
			System.out.println("학생의 점수는 " + score + "이고, 학점은 " + grade + " 입니다");
		} else if (score >= 60 && score < 70) {
			grade = 'D';
			System.out.println("학생의 점수는 " + score + "이고, 학점은 " + grade + " 입니다");
		} else {
			grade = 'F';
			System.out.println("학생의 점수는 " + score + "이고, 학점은 " + grade + " 입니다");
		}

	}

}
