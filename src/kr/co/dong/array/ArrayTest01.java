package kr.co.dong.array;

public class ArrayTest01 {

	public static void main(String[] args) {
//		�迭 : ���� ������ ������ ���� []
//		1.�迭����
		int[] score = new int[5];

		score[0] = 30;
		score[1] = 40;
		score[2] = 50;
		score[3] = 60;
		score[4] = 70;

//		�迭�� ���� �������� : 50
		System.out.println(score[2]);
//		�迭�� ����
		System.out.println("�迭�� ���� : " + score.length);
	}

}
