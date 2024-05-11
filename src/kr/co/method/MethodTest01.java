package kr.co.method;

import java.util.Scanner;

public class MethodTest01 {
	static Scanner sc = new Scanner(System.in);
//	public int sum(int a, int b) {
//		System.out.println("더하기 함수 호출");
//		int sum = 0;
//		sum = a + b;
//		return sum;
//	}
//
//	public int minus(int a, int b) {
//		System.out.println("빼기 함수 호출");
//		int sum = 0;
//		sum = a - b;
//		return sum;
//	}
//
//	public int multiply(int a, int b) {
//		System.out.println("곱하기 함수 호출");
//		int sum = 0;
//		sum = a * b;
//		return sum;
//	}
//
//	public int divide(int a, int b) {
//		System.out.println("나누기 함수 호출");
//		int sum = 0;
//		sum = a / b;
//		return sum;
//	}

	public static void main(String[] args) {
		// 특수문자와 횟수를 입력 받아서 출력하는 함수
//		printChar('$', 3);
		PrintCount pc = new PrintCount();

//		문자열과 휫수를 입력받아서 출력하는 함수 
		pc.print("나는 오늘 우동집에 갈거다.", 5);

//		MethodTest01 mt = new MethodTest01();
//		int key = 0;
//		int num1 = 0;
//		int num2 = 0;
//
//		// 계산기를 메소드로 만들어보자
//		boolean stop = false;
//		while (!stop) {
//			System.out.print("정수 2개 입력 : ");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//
//			System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기");
//			key = sc.nextInt();
//			switch (key) {
//			case 1:
//				mt.sum(num1, num2);
//				break;
//			case 2:
//				mt.minus(num1, num2);
//				break;
//			case 3:
//				mt.multiply(num1, num2);
//				break;
//			case 4:
//				mt.divide(num1, num2);
//				break;
//
//			}
//		}

	}

}
