package kr.co.dong;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int sum, num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 입력하세요 : ");
		num1 = sc.nextInt();

		System.out.print("정수 2 입력하세요 : ");
		num2 = sc.nextInt();

		System.out.print("과일이름 쓰기 : ");
		String fruit = sc.next();
		System.out.println("과일 이름 : " + fruit);

//		sum = num1 + num2;
//		System.out.println("합계 : " + sum);

	}

}
