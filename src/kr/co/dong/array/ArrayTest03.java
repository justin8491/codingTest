package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 5�� �л��� ���������� �ַܼ� �Է¹޾Ƽ�
//		��ü ������ ���ϰ� 70�� �̻��� �л��� ���� ���ϼ���
		Scanner sc = new Scanner(System.in);

		int[] kor = new int[5];
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < kor.length; i++) {
			kor[i] = sc.nextInt();
			sum += kor[i];

			if (kor[i] >= 70) {
				cnt++;
				System.out.println((i + 1) + "�� �л��� ���� : " + kor[i]);

			}
		}

//		for (int i = 0; i < kor.length; i++) {
//			if (kor[i] >= 70) {
//				cnt++;
//				System.out.println((i + 1) + "�� �л��� ���� : " + kor[i]);
//
//			}
//		}
		System.out.println("���� ���� : " + sum);

	}

}
