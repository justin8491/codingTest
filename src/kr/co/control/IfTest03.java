package kr.co.control;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던져서 합이 3, 5, 11 인 경우 승리, 아닌경우패배
		int dice1 = 0;
		int dice2 = 0;
		int sum = 0;

		dice1 = (int) (Math.random() * 6 + 1);
		dice2 = (int) (Math.random() * 6 + 1);

		sum = dice1 + dice2;

		if (sum == 3 || sum == 5 || sum == 11) {
			System.out.println("합계 숫자: " + sum);
			System.out.println("승리");
		} else {
			System.out.println("합계 숫자: " + sum);
			System.out.println("패배");
		}

	}

}
