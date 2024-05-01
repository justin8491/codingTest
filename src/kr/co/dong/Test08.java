/* 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
 * 자료형 : 각 크기별로 분류
 * - 기본형 : boolean, byte, char, short, int, long, float, double
 * - 참조형 : 배열(array), 객체(인스턴스)
 * 
 * - Ascii 코드
 */

package kr.co.dong;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 나이를 입력 받아서 60세 이상이면 "중년"
		// 20세 이상이면 "장년" 20세 미만이면 "청소년"이라는 문자열을 출력하세요

		Scanner sc = new Scanner(System.in);
		int age = 0;

		age = Integer.parseInt(sc.nextLine());

		if (age >= 60) {
			System.out.println("당신은 '중년' 입니다.");
		} else if (age >= 20 && age <= 59) {
			System.out.println("당신은 '장년' 입니다.");
		} else if (age < 20) {
			System.out.println("당신은 '청소년' 입니다.");
		}

	}// end of main

}
