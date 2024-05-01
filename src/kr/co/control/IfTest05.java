package kr.co.control;

import java.util.Scanner;

public class IfTest05 {

	public static void main(String[] args) {
		// 입력 : 학년, 점수

		Scanner sc = new Scanner(System.in);

		int hak = 0;
		int score = 0;

		System.out.print("학년 입력 : ");
		hak = Integer.parseInt(sc.nextLine());
		System.out.print("점수 입력 : ");
		score = Integer.parseInt(sc.nextLine());

		// 3항계산
		String hanJul = hak >= 1 && hak <= 3 ? (score >= 60 ? "합격입니다" : "불합격입니다")
				: (score >= 70 ? "합격입니다." : "불합격입니다.");

		System.out.println(hanJul);
		// 중첩IF 계산
		if (hak >= 1 && hak <= 4) {
			if (hak >= 1 && hak <= 3) {
				if (score >= 60) {
					System.out.println("합격입니다.");
				} else {
					System.out.println("불합격입니다.");
				}
			} else {
				if (score >= 70) {
					System.out.println("합격입니다.");
				} else {
					System.out.println("불합격입니다.");
				}
			}
		} else {
			System.out.println("학년을 1~4 사이로 입력하여 주세요.");
		}

	}

}
