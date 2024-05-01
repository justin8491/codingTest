package kr.co.control;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 1 부터 10까지의 합국하기
		// 시작값 부터 마지막 까지의 모든 홀수를 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			sum += i;
			if (i < 10) {
				System.out.print("+");
			}
		}
		System.out.print("=" + sum);
	}

}
