package kr.coding.test;

import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may" }, { "kein", "deny", "may" }, { "kon", "coni" } };
		solution(name, yearning, photo);

	}

	static public int[] solution(String[] name, int[] yearning, String[][] photo) {
//		int[] answer = new int[photo.length];
//		String tempToS = "";
//		for (int i = 0; i < photo.length; i++) { // 사진 몇장 길이
//			for (int j = 0; j < photo[i].length; j++) { //
//
//				tempToS = photo[i][j];
//
//				for (int idx = 0; idx < photo[i].length; idx++) {
//					if (tempToS.equals(name[idx])) {
//
//						answer[i] += yearning[idx];
//
//					}
//				}
//			}
//		}

		int[] answer = new int[photo.length];

		for (int i = 0; i < photo.length; i++) { // 사진 몇장 길이
			int temp = 0;
			for (int j = 0; j < photo[i].length; j++) { //
				System.out.println("Arrays.asList : " + Arrays.asList(name) + " photo[i][j] : " + photo[i][j]);
				int idx = Arrays.asList(name).indexOf(photo[i][j]);
				System.out.println(idx);
				temp += idx >= 0 ? yearning[idx] : 0;
				System.out.println(temp);
			}
			answer[i] += temp;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
