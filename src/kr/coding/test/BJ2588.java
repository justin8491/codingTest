package kr.coding.test;

import java.util.Scanner;

public class BJ2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		String num2 = "";
		String temp = "";
		int tempToInt = 0;
		int sum = 0;

		num1 = Integer.parseInt(sc.nextLine());
		num2 = sc.nextLine();

		for (int i = 2; i >= 0; i--) {
			temp = "" + num2.charAt(i);
			tempToInt = (Integer.parseInt(temp)) * num1;
			System.out.println(tempToInt);
			if (i == 1) {
				sum += (Integer.parseInt(temp)) * num1 * 10;
			} else if (i == 0) {
				sum += (Integer.parseInt(temp)) * num1 * 100;
			} else {
				sum += (Integer.parseInt(temp)) * num1;
			}

		}

		System.out.println(sum);
	}

}

//for (int i = 2; i <= 0; i++) {
//if (i == 1) {
//	temp = "" + num2.charAt(2);
//	tempToInt = (Integer.parseInt(temp)) * num1;
//	System.out.println(tempToInt);
//	sum += (Integer.parseInt(temp)) * num1;
//} else if (i == 2) {
//	temp = "" + num2.charAt(1);
//	tempToInt = (Integer.parseInt(temp) * 10) * num1;
//	System.out.println(tempToInt);
//	sum += (Integer.parseInt(temp) * 10) * num1;
//} else {
//	temp = "" + num2.charAt(0);
//	tempToInt = (Integer.parseInt(temp) * 100) * num1;
//	System.out.println(tempToInt);
//	sum += (Integer.parseInt(temp) * 100) * num1;
//}
//
//}
