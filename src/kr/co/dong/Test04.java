package kr.co.dong;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// if
		int num1 = 3;
		int num2 = 5;
//		int largeNum = 0;

		int sum = num1 + num2;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수1 입력 : ");
//		num1 = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		num2 = sc.nextInt();

//		if (num1 < num2) {
//			largeNum = num2;
//		} else {
//			largeNum = num1;
//		}
//
//		System.out.println("큰 수는 : " + largeNum);

//		if (num1 < num2) {
//			largeNum = num2;
//			System.out.println("큰수는 : " + largeNum);
//		} else {
//			largeNum = num1;
//			System.out.println("큰수는 : " + largeNum);
//
//		}

//		int score = 93;
//
//		if (score > 60) {
//			System.out.println("당신은 합격 입니다.");
//		} else {
//			System.out.println("탈락!");
//		}
		System.out.printf("두 수의 sum = %3d 입니다. \n", sum);
		System.out.printf("%3d + %3d = %5d 입니다. \n", num1, num2, sum);
		System.out.println("END");
	}

}
