package kr.coding.test;

import java.util.*;

public class BJ11718 {

	public static void main(String[] args) {
		/*
		 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를
		 * 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 * 
		 * Hello Baekjoon Online Judge
		 * 
		 */
		// 선언
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrStr = new ArrayList<>();
		String str = "";
		// 입력
		// 1
//		do {
//			str = sc.nextLine();
//			if (str.isEmpty() || str.startsWith(" ") || str.endsWith(" ") || str.length() > 100) {
//				sc.close();
//				break;
//			}
//			arrStr.add(str);
//		} while (sc.hasNext());

		// 2
//		do {
//			if (sc.hasNext()) {
//				str = sc.nextLine();
//			} else {
//				break;
//			}
//			arrStr.add(str);
//		} while (str.isEmpty() || str.startsWith("") || str.endsWith("") || str.length() < 100);

		try {
			while (sc.hasNext()) {
				str = sc.nextLine();
				if (str.isEmpty() || str.startsWith(" ") || str.endsWith(" ") || str.length() < 100) {
					System.out.println("탈출 조건");
					break;
				}
				arrStr.add(str);
			}
		} catch (Exception e) {
			sc.close();
			e.printStackTrace();

		}

		for (int i = 0; i < arrStr.size(); i++) {
			System.out.println(arrStr.get(i));
		}

		// 출력 부분

	}

}
