package kr.co.control;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		/*
		 * 1. 1~100까지 소수를 출력하세요 소수 : 1과 자신에게만 나누어지는 수
		 * 
		 * 1. 1부터 100까지 출력 2. 소수 구하기
		 * 
		 */

//		int tmp = 100;
//		int temp1 = 0;
//		int temp2 = 0;

//		for (int i = 1; i <= tmp; i++) {
//			if ((i * i) / i != 1) {
//				System.out.println(i);
//			} else {
//				continue;
//			}
//		}

//		for (int i = 2; i <= tmp; i++) {
//			if (tmp % i == 0) {
//				System.out.println(i);
//			}
//		}

		int dan = 3;
		int sum = 0;

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}

		System.out.println("END");

	}

}
