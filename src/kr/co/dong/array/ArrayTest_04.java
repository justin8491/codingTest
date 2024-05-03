package kr.co.dong.array;

public class ArrayTest_04 {

	public static void main(String[] args) {
//		총합과 평균
//		// 변수 초기화
//		int sum = 0;
//		float average = 0f;
//		// 배열 강제 주입값 선언 길이는 5
//		int[] score = { 100, 88, 100, 100, 90 };
//
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		average = sum / (float) 5.0;
//
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + average);
//		최대값과 최소값
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
		
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
		

	}

}
