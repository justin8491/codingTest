/* 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
 * 자료형 : 각 크기별로 분류
 * - 기본형 : boolean, byte, char, short, int, long, float, double
 * - 참조형 : 배열(array), 객체(인스턴스)
 * 
 * - Ascii 코드
 */

package kr.co.dong;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = null; // 객체 선언
		sc = new Scanner(System.in); // 생성하기 -> 인스턴스화

		int num = 0;

		System.out.println("숫자를 입력 : ");

		num = Integer.parseInt(sc.nextLine());

		System.out.println("Input num2 : ");
		int num2 = sc.nextInt();

		System.out.println("END");

	}

}
