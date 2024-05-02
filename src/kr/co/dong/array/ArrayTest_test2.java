package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest_test2 {

	public static void main(String[] args) {
		// 1~9 숫자를 여러개 입력받고 그 숫자들을 카운트해라
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[10];
		int[] cntArr = new int[10];
		String numStr = "";
		String tempString = "";

		System.out.print("여러개의 숫자를 입력해주세요. : ");
		numStr = sc.next();

		for (int i = 0; i < 9; i++) {
			numArr[i] = i + 1;
		}

		for (int i = 0; i < numStr.length(); i++) {
			tempString = numStr.charAt(i) + ""; // 정상
			for (int j = 0; j < numArr.length; j++) {
				if (tempString.equals(numArr[j] + "")) {
					cntArr[numArr[j - 1]]++;
				} else {
					continue;
				}
			}

		}

		for (int i = 0; i < cntArr.length - 1; i++) {
			System.out.println("'" + (numArr[i]) + "'는 " + cntArr[i] + "개");
		}
		System.out.println("END");
	}

}
