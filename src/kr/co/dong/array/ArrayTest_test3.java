package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest_test3 {

	public static void main(String[] args) {

		// �̸��� MBTI�� ���������� �����ִ� �迭
		String[] name = { "������", "������", "�żҿ�", "��ä��", "������", "������", "�赵��", "��ö��", "��ȣ��", "������", "���Ƹ�", "�ü�ȣ", "�ڼ�ȣ",
				"������", "����", "������", "������", "������", "������", "������" };
		String str = "ENFP,INFJ,ESTP,ISTP,ISTJ,ESFJ,ISFP,INTP,INFP,ISTP,ISFP,ENFP,ISTJ,ISFJ,INFP,INTJ,ENFP,ESTP,ENFJ,ISFP";

		// �ٷ� �� ���ڿ� ����ǥ ���� �迭�� �������
		String[] mbti = str.toString().split(",");

		// ���� ����
		String[] mbtiCategory = { "ENFJ", "ENFP", "ENTJ", "ENTP", "ESFJ", "ESFP", "ESTJ", "ESTP", "INFJ", "INFP",
				"INTJ", "INTP", "ISFJ", "ISFP", "ISTJ", "ISTP" };
		String[] mbtiAlpabat = { "E", "I", "N", "S", "F", "T", "P", "J" };
		// ���� ������ ī��Ʈ
		int[] mbtiCnt = new int[16];
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("=================MBTI=================");
			System.out.println("1. E 2. I 3. MBTI�� ��� �� 4. ���� ���� MBTI ");
			System.out.print("������ ��ȣ : ");
			String key = sc.next();
			switch (key) {
			case "1":// E�� ���
				for (int i = 0; i < mbti.length; i++) {
					String tempStr = mbti[i].charAt(0) + "";
					if (tempStr.equals("E")) {
						System.out.println("'E'�λ�� : " + name[i]);
					}
				}
				break;
			case "2": // I�� ���
				for (int i = 0; i < mbti.length; i++) {
					String tempStr = mbti[i].charAt(0) + "";
					if (tempStr.equals("I")) {
						System.out.println("'I'�λ�� : " + name[i]);
					}
				}
				break;
			case "3": // MBTI�� ��� ��
				// ������ ��� ��
				System.out.println("==================================MBTI==================================");
				for (int i = 0; i < mbti.length; i++) {
					for (int j = 0; j < mbtiCategory.length; j++) {
						if (mbti[i].equals(mbtiCategory[j])) {
							// ex) i���ε��� = ���������� �������� �迭�� ������������ ���̸�
							mbtiCnt[j]++;
						}
					}

				}
				System.out.println("ENFJ ENFP ENTJ ENTP ESFJ ESFP ESTJ ESTP INFJ INFP INTJ INTP ISFJ ISFP ISTJ ISTP");
				for (int i = 0; i < mbtiCnt.length; i++) {
					System.out.print(mbtiCnt[i] + "    ");
				}
				System.out.println();
				// ���� ���ĺ� �� ��� ��
				System.out.println("------------------------------------------------------------------------");
				for (int i = 0; i < mbti.length; i++) { // �� ���� ��������
					// ������ �� = ENFP
					for (int k = 0; k < mbti[i].length(); k++) { // �� ���� �������� i �ε��� ���� ���ڿ� ���� ��ŭ
						// charAt
						for (int j = 0; j < mbtiAlpabat.length; j++) { // �˹ٺ� ���� �迭

						}
					}

				}
				System.out.println("==================================MBTI==================================");
				break;
			case "4": // ���� ���� MBTI
				break;
			}

		}

	}

}
