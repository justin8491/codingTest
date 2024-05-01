package kr.co.control;

import java.util.Scanner;

public class IfTest06 {

	public static void main(String[] args) {
		// 성적처리 세분화하기
		// 97점 이상 A+, Ao, 93점 이하면 A-
		// 87점 이상 B+, Bo, 93점 이하면 B-
		// 77점 이상 C+, Co, 93점 이하면 C-
		// 67점 이상 D+, Do, 93점 이하면 D-
		// 60점 미만은 F
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		String operator = "";

		System.out.print("학점 입력 : ");
		score = Integer.parseInt(sc.nextLine());

//		if (100 >= score && score >= 90) {
//			grade = "A";
//			if (score >= 97) {
//				operator = "+";
//			} else if (score <= 93 && 90 <= score) {
//				operator = "-";
//			}
//		} else if (90 >= score && score >= 80) {
//			grade = "B";
//			if (score >= 87) {
//				operator = "+";
//			} else if (score <= 83 && 80 <= score) {
//				operator = "-";
//			}
//		} else if (80 >= score && score >= 70) {
//			grade = "C";
//			if (score >= 77) {
//				operator = "+";
//			} else if (score <= 73 && 70 <= score) {
//				operator = "-";
//			}
//		} else if (70 >= score && score >= 60) {
//			grade = "D";
//			if (score >= 67) {
//				operator = "+";
//			} else if (score <= 63 && 60 <= score) {
//				operator = "-";
//			}
//		} else {
//			grade = "F";
//		}

//		if (score >= 97) {
//			grade = "A";
//			operator = "+";
//		} else if (score < 96 && score > 94) {
//			grade = "A";
//		} else if (score <= 93 && 90 <= score) {
//			grade = "A";
//			operator = "-";
//		} else if (score < 90 && 87 <= score) {
//			grade = "B";
//			operator = "+";
//		} else if (score < 86 && score > 84) {
//			grade = "B";
//		} else if (score <= 83 && 80 <= score) {
//			grade = "B";
//			operator = "-";
//		} else if (score < 80 && 77 <= score) {
//			grade = "C";
//			operator = "+";
//		} else if (score < 76 && score > 74) {
//			grade = "C";
//		} else if (score <= 73 && 70 <= score) {
//			grade = "C";
//			operator = "-";
//		} else if (score < 70 && 67 <= score) {
//			grade = "D";
//			operator = "+";
//		} else if (score < 66 && score > 64) {
//			grade = "D";
//		} else if (score <= 63 && 60 <= score) {
//			grade = "D";
//			operator = "-";
//		} else if (score > 60) {
//			grade = "F";
//		}
		if (score >= 0 && score >= 100) {
			// 학점
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80 && score < 90) {
				grade = "B";
			} else if (score >= 70 && score < 80) {
				grade = "C";
			} else if (score >= 60 && score < 70) {
				grade = "D";
			} else {
				grade = "F";
			}
			// 부호
			if (score >= 60 && score <= 100) {
				int tmp = score % 10;
				if (tmp >= 7 || score == 100) {
					operator = "+";
				} else if (tmp <= 3) {
					operator = "-";
				} else {
					operator = "o";
				}
			}
		} else {
			System.out.println("학점은 1~100 사이의 숫자를 입력해주세요.");
		}

		System.out.println("당신의 학점은 " + grade + operator);
	}

}
