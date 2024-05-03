package kr.co.dong.array;

import java.util.Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
//		QuickSort

		int[] numArr = { 5, 3, 8, 4, 9, 1, 6, 2, 7 };

		System.out.println(Arrays.toString(numArr));

		int[] loNumArr = new int[8];
		int[] hiNumArr = new int[8];

		int[] successArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int pibut;
		int temp = 0;

		int loMove = 0;
		int lo; // �ǹ� + 1 �ּҰ�
		int loIdx = 0;

		int hiMove;
		int hi;
		int hiIdx = 0;

		// ���� ���� ��
		boolean stop = false;
		// ���� �ο� ���� ���� ��
		boolean loStop = false;
		boolean hiStop = false;

//		System.out.println("�ǹ� : " + pibut);
//		System.out.println("�ο� : " + lo);
//		System.out.println("���� : " + hi);
		pibut = numArr[0];
		lo = numArr[loMove + 1];
		hiMove = numArr.length;
		hi = numArr[hiMove - 1];
		int changeArr[] = numArr;
		while (!stop) {
			System.out.println("---------------------------------");
			System.out.println(Arrays.toString(changeArr));
//			�ο� �̵�

			while (true) {

				loMove++;
				lo = changeArr[loMove + 1];
				// �ش���ġ �ε��� �� ���ϱ�
				for (int i = 0; i < changeArr.length; i++) {
					if (lo == changeArr[i]) {
						loIdx = i;
					}
				}
				System.out.println("�ο� �ε��� �� : " + loIdx);
				if (lo >= pibut) { // �ο� ���� �ǹ� ������ ���� ��
					System.out.println("�ο� �� : " + lo + "  STOP");
					break;
				}
			}
			System.out.println("�ο� ����");
			System.out.println("==============================================");
//			���� �̵�
			while (true) {
				--hiMove;
				hi = changeArr[hiMove - 1];
				// �ش� ��ġ ���� �ε��� �� ���ϱ�
				for (int i = 0; i < changeArr.length; i++) {
					if (hi == changeArr[i]) {
						hiIdx = i;
					}
				}
				System.out.println("���� �ε��� �� : " + hiIdx);
				if (hi <= pibut) { // ���̰� ���� ��� ���� ���ų� ���� ��
					System.out.println("���� �� : " + hi + "  STOP");
					break;
				}

			}
			System.out.println("���� ����");
			// ���� <=> �ǹ�ü����
			if (hiIdx > loIdx) {
				// ���� �ε����� �ο� �ε��� ������ �� Ŭ�� (������)
				// ü���� �� �ο찪�� �� ũ�� ���� ���� ü����
				// ���̷ο� ���� X ���� �ο� ü����
				temp = changeArr[loIdx];
				changeArr[loIdx] = changeArr[hiIdx];
				changeArr[hiIdx] = temp;

			} else if (loIdx > hiIdx) {
//				1. 1�� ���� �ߴ� �ߴ�
//				2. �ǹ� ���� ���� �� �ε����� ����, �ǹ� �ε����� ���� ���� ����(ü������)

				// ���� <=> �ǹ� ü����

				temp = pibut;
				changeArr[0] = changeArr[hiIdx];
				changeArr[hiIdx] = temp;
				System.out.println(Arrays.toString(changeArr));
//				break;

				// �� �ش� ������ ture or false
				if (loStop == true && hiStop == true) {
					hiStop = false;
					loStop = false;

				} else if (loStop == true && hiStop == false) {
					hiStop = true;
				} else if (loStop == false && hiStop == false) {
					loStop = true;
				}
				// �迭 ������ �ٽ� ������
				if (loStop && hiStop == false) {
					loNumArr = Arrays.copyOfRange(changeArr, 0, hiIdx + 1);
					System.out.println(">>>>>>>>>>>>>>>>>>�ο� ���� �迭 �� : " + Arrays.toString(loNumArr));
				} else if (hiStop && loStop == false) {
					hiNumArr = Arrays.copyOfRange(changeArr, hiIdx + 1, changeArr.length - 1);
					System.out.println(">>>>>>>>>>>>>>>>>>���� ���� �迭 �� : " + Arrays.toString(hiNumArr));

				}
				pibut = changeArr[0];
				lo = changeArr[loMove + 1];
				hiMove = changeArr.length;
				hi = changeArr[hiMove - 1];

			}

			// �ǹ� <=> ���� ��ȯ �� ���� �� �������� ���� ������ ������ �Ȱ��� ����

			// Ż�� ��
			if (changeArr == successArr || hiIdx == 0 || loIdx == 8) {
				System.out.println("���� ����");
				stop = true;
			}
		}

	}

}
