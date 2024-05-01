package kr.co.control;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// 1. 콘솔로 정수를 입력받아서
		// 2. 1부터 입력받은 수까지 출력한다.

		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 3 != 0) {
				System.out.println(i);
			} else {
				continue;
			}

		}

		System.out.println("END");

	}

}


















