package kr.coding.test;

import java.util.Scanner;

public class BJ9498 {

	public static void main(String[] args) {

		/*
		 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F��
		 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;

		score = sc.nextInt();

		System.out.println(score >= 90 && score <= 100 ? 'A'
				: score >= 80 && score <= 89 ? 'B'
						: score >= 70 && score <= 79 ? 'C' : score >= 60 && score <= 69 ? 'D' : 'F');
		
	}

}
