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
		int lo; // 피벗 + 1 주소값
		int loIdx = 0;

		int hiMove;
		int hi;
		int hiIdx = 0;

		// 정렬 전원 값
		boolean stop = false;
		// 하이 로우 나눈 전원 값
		boolean loStop = false;
		boolean hiStop = false;

//		System.out.println("피벗 : " + pibut);
//		System.out.println("로우 : " + lo);
//		System.out.println("하이 : " + hi);
		pibut = numArr[0];
		lo = numArr[loMove + 1];
		hiMove = numArr.length;
		hi = numArr[hiMove - 1];
		int changeArr[] = numArr;
		while (!stop) {
			System.out.println("---------------------------------");
			System.out.println(Arrays.toString(changeArr));
//			로우 이동

			while (true) {

				loMove++;
				lo = changeArr[loMove + 1];
				// 해당위치 인덱스 값 구하기
				for (int i = 0; i < changeArr.length; i++) {
					if (lo == changeArr[i]) {
						loIdx = i;
					}
				}
				System.out.println("로우 인덱스 값 : " + loIdx);
				if (lo >= pibut) { // 로우 값이 피벗 값보다 높을 때
					System.out.println("로우 값 : " + lo + "  STOP");
					break;
				}
			}
			System.out.println("로우 종료");
			System.out.println("==============================================");
//			하이 이동
			while (true) {
				--hiMove;
				hi = changeArr[hiMove - 1];
				// 해당 위치 하이 인덱스 값 구하기
				for (int i = 0; i < changeArr.length; i++) {
					if (hi == changeArr[i]) {
						hiIdx = i;
					}
				}
				System.out.println("하이 인덱스 값 : " + hiIdx);
				if (hi <= pibut) { // 하이값 보다 비벗 값이 높거나 같은 때
					System.out.println("하이 값 : " + hi + "  STOP");
					break;
				}

			}
			System.out.println("하이 종료");
			// 하이 <=> 피벗체인지
			if (hiIdx > loIdx) {
				// 하이 인덱스가 로우 인덱스 값보다 더 클때 (진행형)
				// 체인지 전 로우값이 더 크면 하이 값과 체인지
				// 하이로우 역전 X 하이 로우 체인지
				temp = changeArr[loIdx];
				changeArr[loIdx] = changeArr[hiIdx];
				changeArr[hiIdx] = temp;

			} else if (loIdx > hiIdx) {
//				1. 1차 정렬 중단 중단
//				2. 피벗 값을 하이 값 인덱스에 저장, 피벗 인덱스에 하이 값을 저장(체인지형)

				// 하이 <=> 피벗 체인지

				temp = pibut;
				changeArr[0] = changeArr[hiIdx];
				changeArr[hiIdx] = temp;
				System.out.println(Arrays.toString(changeArr));
//				break;

				// 둘 해당 조건은 ture or false
				if (loStop == true && hiStop == true) {
					hiStop = false;
					loStop = false;

				} else if (loStop == true && hiStop == false) {
					hiStop = true;
				} else if (loStop == false && hiStop == false) {
					loStop = true;
				}
				// 배열 나누어 다시 돌리기
				if (loStop && hiStop == false) {
					loNumArr = Arrays.copyOfRange(changeArr, 0, hiIdx + 1);
					System.out.println(">>>>>>>>>>>>>>>>>>로우 나눈 배열 값 : " + Arrays.toString(loNumArr));
				} else if (hiStop && loStop == false) {
					hiNumArr = Arrays.copyOfRange(changeArr, hiIdx + 1, changeArr.length - 1);
					System.out.println(">>>>>>>>>>>>>>>>>>하이 나눈 배열 값 : " + Arrays.toString(hiNumArr));

				}
				pibut = changeArr[0];
				lo = changeArr[loMove + 1];
				hiMove = changeArr.length;
				hi = changeArr[hiMove - 1];

			}

			// 피벗 <=> 하이 교환 후 하이 값 기준으로 왼쪽 오른쪽 나눠서 똑같은 정렬

			// 탈출 값
			if (changeArr == successArr || hiIdx == 0 || loIdx == 8) {
				System.out.println("정렬 종료");
				stop = true;
			}
		}

	}

}
