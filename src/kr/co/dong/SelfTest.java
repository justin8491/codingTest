package kr.co.dong;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		char sign = ' ';

		System.out.print("정수를 입력해주세요 : ");

		num = sc.nextInt();

		if (num >= 0) {
			if (num != 0) {
				sign = '+';
			} else {
				sign = '-';
			}
		}

		System.out.println("Operator : " + sign);

	}

}
