package kr.co.method;

import java.util.Scanner;

public class MethodTest01 {
	static Scanner sc = new Scanner(System.in);
//	public int sum(int a, int b) {
//		System.out.println("���ϱ� �Լ� ȣ��");
//		int sum = 0;
//		sum = a + b;
//		return sum;
//	}
//
//	public int minus(int a, int b) {
//		System.out.println("���� �Լ� ȣ��");
//		int sum = 0;
//		sum = a - b;
//		return sum;
//	}
//
//	public int multiply(int a, int b) {
//		System.out.println("���ϱ� �Լ� ȣ��");
//		int sum = 0;
//		sum = a * b;
//		return sum;
//	}
//
//	public int divide(int a, int b) {
//		System.out.println("������ �Լ� ȣ��");
//		int sum = 0;
//		sum = a / b;
//		return sum;
//	}

	public static void main(String[] args) {
		// Ư�����ڿ� Ƚ���� �Է� �޾Ƽ� ����ϴ� �Լ�
//		printChar('$', 3);
		PrintCount pc = new PrintCount();

//		���ڿ��� �ܼ��� �Է¹޾Ƽ� ����ϴ� �Լ� 
		pc.print("���� ���� �쵿���� ���Ŵ�.", 5);

//		MethodTest01 mt = new MethodTest01();
//		int key = 0;
//		int num1 = 0;
//		int num2 = 0;
//
//		// ���⸦ �޼ҵ�� ������
//		boolean stop = false;
//		while (!stop) {
//			System.out.print("���� 2�� �Է� : ");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//
//			System.out.println("1. ���ϱ� 2. ���� 3. ���ϱ� 4. ������");
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
