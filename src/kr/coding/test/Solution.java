package kr.coding.test;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
//		String[] name = { "may", "kein", "kain", "radi" };
//		int[] yearning = { 5, 10, 1, 3 };
//		String[][] photo = { { "may" }, { "kein", "deny", "may" }, { "kon", "coni" } };
//		solution(name, yearning, photo);
		// 옹알이
//		String[] one = { "aya", "yee", "u", "maa", "wyeoo" };
//		solution(one);
//		String[] two = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
//		solution(two);
		// 경주
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		solution(players, callings);
	}

	// Lv1. 경주
	static public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		String reversal = "";
		for (int i = 0; i < callings.length; i++) {
			for (int j = 1; j < players.length; j++) {
				if (callings[i].equals(players[j])) {
					reversal = players[j];
					players[j] = players[j - 1];
					players[j - 1] = reversal;
				}
			}
		}
//		for (int i = 0; i < callings.length; i++) {
//			int temp = 0;
////			int idx = players[i].indexOf(callings[i]);
//			int idx = players[i].indexOf(callings[temp]);
////			System.out.println(idx);
//			for (int j = 0; j < callings.length; j++) {
//				if (players[j].equals(callings[i])) {
//					reversal = players[j];
//					players[j] = players[j - 1];
//					players[j - 1] = reversal;
//				}
//			}
//			System.out.println(Arrays.toString(players));
//

		System.out.println(Arrays.toString(players));
		answer = players;
		return answer;
	}

//	Lv.0 옹알이(1)
	static public int solution(String[] babbling) {
		// "aya", "ye", "woo", "ma"
//		1. 이중포문으로 해당배열의 문자열 길이파악
//		2. 문자열 중 "aya", "ye", "woo", "ma" 들어가면 잘라내기
//		2-1. 잘라낸 나머지 문자열이 "" 인경우 cnt++
//		3. 잘라내고 값이 없을 경우 카운트
		int answer = 0;
		String tempS = "";
		String[] sub = { "aya", "ye", "woo", "ma" };
		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < sub.length; j++) {
				tempS = babbling[i].replace(sub[j], " ");
				tempS = tempS.trim();
				babbling[i] = tempS;
			}
			if (tempS.length() == 0) {
				answer++;
			}
		}
		System.out.println("Answer : " + answer);
		return answer;
	}

	// Lv1. 추억점수
	static public int[] solution(String[] name, int[] yearning, String[][] photo) {

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
