package kr.coding.test;

import java.util.Scanner;

public class BJ9498 {

	public static void main(String[] args) {

		/*
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를
		 * 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;

		score = sc.nextInt();

		System.out.println(score >= 90 && score <= 100 ? 'A'
				: score >= 80 && score <= 89 ? 'B'
						: score >= 70 && score <= 79 ? 'C' : score >= 60 && score <= 69 ? 'D' : 'F');
		
	}

}
