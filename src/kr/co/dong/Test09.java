/* 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
 * 자료형 : 각 크기별로 분류
 * - 기본형 : boolean, byte, char, short, int, long, float, double
 * - 참조형 : 배열(array), 객체(인스턴스)
 * 
 * - Ascii 코드
 */

package kr.co.dong;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 학점출력 예제
		// 점수가 90점 이상이면 A학점입니다. 출력
		// 90미만이면 B학점입니다. 출력
		// 스캐너 사용하여 점수를 입력
		// A : 90~100점
		// B : 80~89점
		// C : 70~79점
		// D : 60~69점
		// F : 60점 미만

		// 선언
		Scanner sc = new Scanner(System.in);
		int score = 0;

		// 입력
		System.out.print("당신의 학점을 입력 : ");
		score = Integer.parseInt(sc.nextLine());

		if (score >= 90) {
			System.out.println("당신의 학점은 A");
		} else if (score >= 80 && score < 90) {
			System.out.println("당신의 학점은 B");
		} else if (score >= 70 && score < 80) {
			System.out.println("당신의 학점은 C");
		} else if (score >= 60 && score < 70) {
			System.out.println("당신의 학점은 D");
		} else {
			System.out.println("당신의 학점은 F");
		}
		
	}// end of main

}
