package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {
//		2���� �迭 : ��� ��(�ٰ� ĭ)
//		1. ���� ���� ���� ������ �ַܼ� �Է� �ϱ� => ������(Subject)
//		2. �л����� 5�� 

		int size = 5;
		int cnt = 3;
		int sum = 0;
		int[][] subject = new int[size][cnt];
		Scanner sc = new Scanner(System.in);
		String[] sName = { "�ü�ȣ", "������", "������", "������", "�赵��" };
		String[] subject2 = { "����", "����", "����" };
		for (int i = 0; i < sName.length; i++) {
			System.out.println(sName[i] + " �л��� ���� �Է��ϱ�");
			for (int j = 0; j < subject2.length; j++) {
				System.out.print(subject2[j] + " ���� ���� : ");
				subject[i][j] = sc.nextInt();
			}
		}
		System.out.println("      ����  ����  ����");
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