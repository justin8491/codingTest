/* 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
 * 자료형 : 각 크기별로 분류
 * - 기본형 : boolean, byte, char, short, int, long, float, double
 * - 참조형 : 배열(array), 객체(인스턴스)
 * 
 * - Ascii 코드
 */

package kr.co.dong;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		int money1 = 5, money2 = 10; // 금액
		float temp = 0.0f;
		
		
		temp = money1; //(float)생략 가능: 정수값을 실수형에 강제 대입
		money2 = (int)temp; // 실수값을 정수형에 강제 대입
		
		System.out.println(temp);
		System.out.println(money2);
	}

}
