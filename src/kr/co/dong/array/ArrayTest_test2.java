package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest_test2 {

	public static void main(String[] args) {
		// 1~9 ���ڸ� ������ �Է¹ް� �� ���ڵ��� ī��Ʈ�ض�
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[10];
		int[] cntArr = new int[10];
		String numStr = "";
		String tempString = "";

		System.out.print("�������� ���ڸ� �Է����ּ���. : ");
		numStr = sc.next();

		for (int i = 0; i < 9; i++) {
			numArr[i] = i + 1;
		}

		for (int i = 0; i < numStr.length(); i++) {
			tempString = numStr.charAt(i) + ""; // ����
			for (int j = 0; j < numArr.length; j++) {
				if (tempString.equals(numArr[j] + "")) {
					cntArr[numArr[j - 1]]++;
				} else {
					continue;
				}
			}

		}

		for (int i = 0; i < cntArr.length - 1; i++) {
			System.out.println("'" + (numArr[i]) + "'�� " + cntArr[i] + "��");
		}
		System.out.println("END");
	}

}
