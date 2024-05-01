package kr.co.control;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// 콘솔로 시작 값과 마지막 값을 입력받고
		// 시작값 부터 마지막 까지의 모든 홀수를 출력

		Scanner sc = new Scanner(System.in);

		int startNum = 0;
		int endNum = 0;

		System.out.print("시작 숫자 입력 : ");
		startNum = sc.nextInt();

		System.out.print("끝 숫자 입력 : ");
		endNum = sc.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			if (i != 0) {
				if (i % 2 != 0)
					System.out.println(i);
			}
		}

		System.out.println("END");

	}

}
