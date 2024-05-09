package kr.co.dong.array;

import java.util.Scanner;

public class ArrayReport01 {

	public static void main(String[] args) {

		// 야구 게임
		// 3 자리 랜덤 숫자가 주어지지만 보이지 않는다
		// 사용자는 숫자 3자리를 입력하여 맞은 숫자가 있으면 ?몇개 맞았는지 체크하여 "?(숫자)볼" 출력
		// 전부 맞은경우 스트라이크
		// 전부 맞을때까지 무한루프로 돌다가 종료시 끝날 것

		// <--선언부-->
		Scanner sc = new Scanner(System.in);
		int[] randomNumList = new int[3];

		// 숫자 유효성 체크 값
		int cnt = 0;
		int temp = 0;

		// 숫자 던지기(맞추는 값)
		int[] attackList = new int[3];
		int attack = 0;

		// 숫자 볼(맞춘 값)
		int ball = 0;
		// 게임종료 값
		boolean stop = false;

		// 랜덤 숫자값 만들어 배열에 넣기
		for (int i = 0; i < randomNumList.length; i++) {
			randomNumList[i] = (int) (Math.random() * 9 + 1);
		}

		// 랜덤 값이 같은 숫자가 있을 경우 숫자 체인지
		for (int i = 0; i < randomNumList.length; i++) {
			if (cnt == temp) {
				cnt = randomNumList[i];
			}

			for (int j = 0; j < randomNumList.length; j++) {
				if (randomNumList[i] == randomNumList[j]) {
					randomNumList[j] = (int) (Math.random() * 9 + 1);
					temp = randomNumList[j];
				} else {
					break;
				}
			}
		}

		// 야구게임 시작
		while (!stop) {
			System.out.println("\n"
					+ "░▒▓███████▓▒░ ░▒▓██████▓▒░ ░▒▓███████▓▒░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓█▓▒░        \n"
					+ "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░        \n"
					+ "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░        \n"
					+ "░▒▓███████▓▒░░▒▓████████▓▒░░▒▓██████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░        \n"
					+ "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░        \n"
					+ "░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░        \n"
					+ "░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓████████▓▒░ \n"
					+ "");
			System.out.println("(1~9 값 중 숫자 3자리를 입력 해주세요.");
			// 입력 구문 만들기
			for (int i = 0; i < attackList.length; i++) {
				attack = sc.nextInt();
				attackList[i] = attack;
			}

			for (int i = 0; i < randomNumList.length; i++) {
				temp = 0;
				for (int j = 0; j < attackList.length; j++) {
					if (attackList[j] == temp) {
						continue;
					}
					if (randomNumList[i] == attackList[j]) {
						ball++;
						temp = attackList[j];
					}
				}
			}

			// 맞았을 때 와 틀렸을 때 초기화 및 탈출
			if (ball < 3) { // 스트라이크가 아닐 때
				System.out.println(ball + " 볼 입니다.");
				for (int i : randomNumList) {
					System.out.print(i + "  ");
				}
				System.out.println();
				ball = 0;
			} else if (ball >= 3) {
				// 같은 숫자가 나왔을 때의 카운트 갯수도 확인해볼 것
				System.out.println(" ░▒▓███████▓▒░▒▓████████▓▒░▒▓███████▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓█▓▒░ \n"
						+ "░▒▓█▓▒░         ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░ \n"
						+ "░▒▓█▓▒░         ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░ \n"
						+ " ░▒▓██████▓▒░   ░▒▓█▓▒░   ░▒▓███████▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓█▓▒░ \n"
						+ "       ░▒▓█▓▒░  ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░ \n"
						+ "       ░▒▓█▓▒░  ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░              \n"
						+ "░▒▓███████▓▒░   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓█▓▒░ ");
				break;
			}

		}

	}

}
