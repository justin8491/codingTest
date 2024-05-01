package kr.co.control;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		/*
		 * 스캐너를 통해 정수입력받고 1부터 입력받은 정수까지 합 출력
		 */

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합은 : " + sum);

		System.out.println("END");

	}

}
