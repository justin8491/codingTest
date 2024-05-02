package kr.co.dong.array;

public class ArrayTest02 {

	public static void main(String[] args) {
//		0, 10, 20, 30, 40,
		int[] score = new int[5];
		for(int i = 0;i<5;i++) {
			score[i] = i*10;
			System.out.print(score[i] + ", ");
		}
	}

}
