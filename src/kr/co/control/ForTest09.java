package kr.co.control;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해 시작 값,마지막 값을 입력받고 2. 시작값 부터 마지막 값 까지의 숫자들 중에서 짝수들의 합 구하기 ex) 5 8 입력
		 * 5~8사이의 숫자중 짝수는 6, 8 이므로
		 * 
		 * 5부터 8까지 숫자들 중 짝수의 합은 14 출력
		 */
		Scanner sc = new Scanner(System.in);

		int startNum = 0;
		int endNum = 0;
		int sum = 0;

		System.out.print("시작 값 입력 : ");
		startNum = sc.nextInt();
		System.out.print("끝 값 입력 : ");
		endNum = sc.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(startNum + "부터 " + endNum + "까지의 합은 " + sum);

		System.out.println("END");

	}

}
