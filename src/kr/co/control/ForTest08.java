package kr.co.control;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해 시작 값,마지막 값을 입력받고 2. 시작값 부터 마지막 값 까지의 합을 출력 ex) 5 8 입력 [5+6+7+8
		 * 이므로] 5부터 8까지의 합은 26 출력
		 */
		Scanner sc = new Scanner(System.in);
		int startNum = 0;
		int endNum = 0;
		int sum = 0;

		System.out.print("시작 값 : ");
		startNum = sc.nextInt();
		System.out.print("끝 값 : ");
		endNum = sc.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}

		System.out.println(startNum + "부터 " + endNum + "까지의 합은 " + sum);

		System.out.println("END");

	}

}
