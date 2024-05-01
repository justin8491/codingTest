package kr.co.control;

import java.util.Scanner;

public class IfTest04 {

	public static void main(String[] args) {
		// 세 정수를 콘솔로 입력받아서 중간수를 출력하세요~

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		num1 = Integer.parseInt(sc.nextLine());
		num2 = Integer.parseInt(sc.nextLine());
		num3 = Integer.parseInt(sc.nextLine());

		// 1
		if (num1 < num2 && num3 < num1 || num2 < num1 && num1 < num3) {
			System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
			System.out.println("중간수 : " + num1);
			// 2
		} else if (num2 < num3 && num2 > num1 || num3 < num2 && num1 > num2) {
			System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
			System.out.println("중간수 : " + num2);
			// 3
		} else if (num1 < num3 && num3 < num2 || num3 < num1 && num2 < num3) {
			System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
			System.out.println("중간수 : " + num3);
		} else {
			System.out.println("실패했다 돌아가");
		}
	}

}
