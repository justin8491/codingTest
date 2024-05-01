package kr.co.control;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		/*
		 * ======================선택하기====================== 1. 두수의 합 2. 구구단 3. 1~100까지의합
		 * 999.종료
		 */

		// 선언
		Scanner sc = new Scanner(System.in);
		// 1. 두수 합
		int switchNum = 0;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		// 2. 구구단
		int dan = 2;

		boolean stop = false;

		while (!stop) {
			System.out.println("======================선택하기======================");
			System.out.println("1. 두수의 합 2. 구구단 3. 1~100까지의 합 999.종료");
			System.out.print("선택한 번호 : ");
			switchNum = sc.nextInt();
			switch (switchNum) {
			case 1:
				System.out.print("정수 1 입력 : ");
				num1 = sc.nextInt();
				System.out.print("정수 2 입력 : ");
				num2 = sc.nextInt();

				sum = num1 + num2;
				System.out.println("두 수의 합은 : " + sum);
				break;
			case 2:
				for (int i = dan; i <= 9; i++) {

					for (int j = 1; j <= 9; j++) {
						System.out.print(i + " X " + j + " = " + i * j);
						if (j != 9) {
							System.out.print(" : ");
						}
					}
					System.out.println();
				}
				break;
			case 3:
				sum = 0;
				for (int i = 0; i <= 100; i++) {
					sum += i;
				}
				System.out.println("1~100까지의 합은? : " + sum);
				break;
			case 999:
				System.out.println("시스템을 종료합니다.");
				stop = true;
				break;
			}
		}

	}

}
