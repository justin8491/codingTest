package kr.co.dong.array;

public class ArrayTest_04 {

	public static void main(String[] args) {
//		���հ� ���
//		// ���� �ʱ�ȭ
//		int sum = 0;
//		float average = 0f;
//		// �迭 ���� ���԰� ���� ���̴� 5
//		int[] score = { 100, 88, 100, 100, 90 };
//
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		average = sum / (float) 5.0;
//
//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + average);
//		�ִ밪�� �ּҰ�
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("�ִ� �� : " + max);
		System.out.println("�ּ� �� : " + min);
		

	}

}
