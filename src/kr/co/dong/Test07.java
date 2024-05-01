/* 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
 * 자료형 : 각 크기별로 분류
 * - 기본형 : boolean, byte, char, short, int, long, float, double
 * - 참조형 : 배열(array), 객체(인스턴스)
 * 
 * - Ascii 코드
 */

package kr.co.dong;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 두 정수를 콘솔로 입력받아서
		// 어떤 수가 큰지 출력하세요
		// 선언
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		// 입력
		System.out.println("정수 1 입력 : ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수 2 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());
		// 출력
		if (num1 < num2) {
			System.out.println("정수 2가 더 큽니다.");
		} else {
			System.out.println("정수 1가 더 큽니다.");
		}
	}// end of main

}
