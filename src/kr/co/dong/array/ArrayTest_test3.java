package kr.co.dong.array;

import java.util.Scanner;

public class ArrayTest_test3 {

	public static void main(String[] args) {

		// 이름과 MBTI가 순차적으로 적혀있는 배열
		String[] name = { "박지혜", "김정현", "신소운", "윤채영", "윤가을", "이제은", "김도현", "김철현", "김호현", "장현세", "유아름", "궁성호", "박성호",
				"유종현", "어한", "김형모", "강승현", "정윤휘", "조성민", "조재현" };
		String str = "ENFP,INFJ,ESTP,ISTP,ISTJ,ESFJ,ISFP,INTP,INFP,ISTP,ISFP,ENFP,ISTJ,ISFJ,INFP,INTJ,ENFP,ESTP,ENFJ,ISFP";

		// 바로 위 문자열 따운표 기준 배열로 나눠담기
		String[] mbti = str.toString().split(",");

		// 성격 유형
		String[] mbtiCategory = { "ENFJ", "ENFP", "ENTJ", "ENTP", "ESFJ", "ESFP", "ESTJ", "ESTP", "INFJ", "INFP",
				"INTJ", "INTP", "ISFJ", "ISFP", "ISTJ", "ISTP" };
		String[] mbtiAlpabat = { "E", "I", "N", "S", "F", "T", "P", "J" };
		// 성격 유형별 카운트
		int[] mbtiCnt = new int[16];
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("=================MBTI=================");
			System.out.println("1. E 2. I 3. MBTI별 사람 수 4. 나와 같은 MBTI ");
			System.out.print("선택한 번호 : ");
			String key = sc.next();
			switch (key) {
			case "1":// E인 사람
				for (int i = 0; i < mbti.length; i++) {
					String tempStr = mbti[i].charAt(0) + "";
					if (tempStr.equals("E")) {
						System.out.println("'E'인사람 : " + name[i]);
					}
				}
				break;
			case "2": // I인 사람
				for (int i = 0; i < mbti.length; i++) {
					String tempStr = mbti[i].charAt(0) + "";
					if (tempStr.equals("I")) {
						System.out.println("'I'인사람 : " + name[i]);
					}
				}
				break;
			case "3": // MBTI별 사람 수
				// 유형별 사람 수
				System.out.println("==================================MBTI==================================");
				for (int i = 0; i < mbti.length; i++) {
					for (int j = 0; j < mbtiCategory.length; j++) {
						if (mbti[i].equals(mbtiCategory[j])) {
							// ex) i번인덱스 = 박지혜씨로 성격유형 배열을 돌렸을때같은 값이면
							mbtiCnt[j]++;
						}
					}

				}
				System.out.println("ENFJ ENFP ENTJ ENTP ESFJ ESFP ESTJ ESTP INFJ INFP INTJ INTP ISFJ ISFP ISTJ ISTP");
				for (int i = 0; i < mbtiCnt.length; i++) {
					System.out.print(mbtiCnt[i] + "    ");
				}
				System.out.println();
				// 유형 알파벳 별 사람 수
				System.out.println("------------------------------------------------------------------------");
				for (int i = 0; i < mbti.length; i++) { // 반 순차 성격유형
					// 박지혜 씨 = ENFP
					for (int k = 0; k < mbti[i].length(); k++) { // 반 순차 성격유형 i 인덱스 값의 문자열 길이 만큼
						// charAt
						for (int j = 0; j < mbtiAlpabat.length; j++) { // 알바벳 유형 배열

						}
					}

				}
				System.out.println("==================================MBTI==================================");
				break;
			case "4": // 나와 같은 MBTI
				break;
			}

		}

	}

}
