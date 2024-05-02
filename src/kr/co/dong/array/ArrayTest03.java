package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 5명 학생의 국어점수를 콘솔로 입력받아서
//		전체 총합을 구하고 70점 이상인 학생의 수를 구하세요
		Scanner sc = new Scanner(System.in);

		int[] kor = new int[5];
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < kor.length; i++) {
			kor[i] = sc.nextInt();
			sum += kor[i];

			if (kor[i] >= 70) {
				cnt++;
				System.out.println((i + 1) + "번 학생의 점수 : " + kor[i]);

			}
		}

//		for (int i = 0; i < kor.length; i++) {
//			if (kor[i] >= 70) {
//				cnt++;
//				System.out.println((i + 1) + "번 학생의 점수 : " + kor[i]);
//
//			}
//		}
		System.out.println("총합 점수 : " + sum);

	}

}
