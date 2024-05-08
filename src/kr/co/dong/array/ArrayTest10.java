package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {
//		2차원 배열 : 행과 열(줄과 칸)
//		1. 국어 영어 수학 점수를 콘솔로 입력 하기 => 교과목(Subject)
//		2. 학생수는 5명 

		int size = 5;
		int cnt = 3;
		int sum = 0;
		int[][] subject = new int[size][cnt];
		Scanner sc = new Scanner(System.in);
		String[] sName = { "궁성호", "유종현", "장현세", "윤가을", "김도현" };
		String[] subject2 = { "국어", "영어", "수학" };
		for (int i = 0; i < sName.length; i++) {
			System.out.println(sName[i] + " 학생의 점수 입력하기");
			for (int j = 0; j < subject2.length; j++) {
				System.out.print(subject2[j] + " 과목 점수 : ");
				subject[i][j] = sc.nextInt();
			}
		}
		System.out.println("      국어  영어  수학");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(sName[i] + "  ");

			for (int j = 0; j < 3; j++) {
				System.out.print(subject[i][j] + "    ");
				sum += subject[i][j];
			}
			System.out.print(sum);
			System.out.print("    " + (float) sum / subject2.length);
			sum = 0;
			System.out.println();
		}

	}
}