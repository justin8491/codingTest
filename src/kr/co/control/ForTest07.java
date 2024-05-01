package kr.co.control;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수들을 출력하고 3의 배수들의 총합을 구하는 코드를 작성
		 */
		int sum = 0;
		int tmp = 0;

		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("3배수 100까지 총합 : " + sum);

		System.out.println("END");

	}

}
