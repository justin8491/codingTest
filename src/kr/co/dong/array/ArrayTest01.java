package kr.co.dong.array;

public class ArrayTest01 {

	public static void main(String[] args) {
//		배열 : 같은 유형의 데이터 모음 []
//		1.배열선언
		int[] score = new int[5];

		score[0] = 30;
		score[1] = 40;
		score[2] = 50;
		score[3] = 60;
		score[4] = 70;

//		배열의 값을 가져오기 : 50
		System.out.println(score[2]);
//		배열의 길이
		System.out.println("배열의 길이 : " + score.length);
	}

}
