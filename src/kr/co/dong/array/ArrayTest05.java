package kr.co.dong.array;

import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		int[] numArr = new int[10];

		int temp = 0;
		for (int i = 0; i < numArr.length - 1; i++) {
			numArr[i] = i + 1;
			System.out.println(Arrays.toString(numArr));
		}
		
	}
	

}
