package kr.co.control;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// 정수를 입력받아서
		// 메뉴번호 999 -> 탈출 아니면 계속
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (!(num == 999)) {
			System.out.print("숫자를 입력 하세요 : ");
			num = sc.nextInt();

		}

		System.out.println("End");

	}

}
