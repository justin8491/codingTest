package kr.co.control;

import java.util.Scanner;

public class ForTest12 {

	public static void main(String[] args) {
		/*
		 * * ** *** **** *****
		 */

		Scanner sc = new Scanner(System.in);
//		System.out.print("별을 찍을 행의 수 입력 : ");
//		int num = sc.nextInt();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
