package kr.co.check;

import java.util.ArrayList;
import java.util.Scanner;

public class Report14_MoneyOutput {

	public static void main(String[] args) {
		/*
		 * 소스 : 음료자판기V1.0 작성일 : 2024-04-29 작성자 : 유종현 클래스파일 : 홍길동의 번호가 33인경우 Report33 ->
		 * 수정이 일어나면 Report33_01 1. 음료의 종류는 3가지 - 이름, 가격, 재고수로 구성됨 2. 전원이 꺼질때까지 계속 동작합니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// 이름, 재고 수, 가격 1.자몽에이드(1600) 2.생강에이드(1700) 3.청포도에이드(1200)
		String jusName = "";
		String[] jusNameArr = new String[3];
		jusNameArr[0] = "자몽에이드";
		jusNameArr[1] = "생강에이드";
		jusNameArr[2] = "청포도에이드";
		int[] stockCount = new int[3];
		stockCount[0] = 2;
		stockCount[1] = 3;
		stockCount[2] = 4;

		ArrayList<String> jusArr = new ArrayList<String>();

		// 음료 가격
		int price = 0;
		int[] priceToArr = new int[3]; // 음료 가격 배열
		priceToArr[0] = 1600;
		priceToArr[1] = 1700;
		priceToArr[2] = 1200;

		// 음료 가격 합계
		int[] jusCount = new int[3]; // 음료 구매 갯수 배열
		jusCount[0] = 0;
		jusCount[1] = 0;
		jusCount[2] = 0;

		int sum = 0; // 합계
		// 선택 주스
		int selectJusNum = 0;
		// 넣을 돈
		int insertMoney = 0;

		// 기타 변수
		String talk = "";

		// 입력
		while (true) { // 전원이 꺼질리가 없다
			// 음료 초기화값
//			jusArr.add(0, "");
//			jusArr.add(1, "");
//			jusArr.add(2, "");
			// 돈 삽입

			System.out.println("=============================== 자판기 ================================");
			System.out.println("1." + jusNameArr[0] + "(1600)" + "(" + (stockCount[0] != 0 ? stockCount[0] : "재고없음")
					+ ")" + " 2." + jusNameArr[1] + "(1700)" + "(" + (stockCount[1] != 0 ? stockCount[1] : "재고없음") + ")"
					+ " 3." + jusNameArr[2] + "(1200)" + "(" + (stockCount[2] != 0 ? stockCount[2] : "재고없음") + ")"
					+ " 4.계산 5.금액 투입 ");
			System.out.print("선택할 값 : ");

			selectJusNum = sc.nextInt();

			switch (selectJusNum) {
			case 1:
			case 2:
			case 3: // 자몽
				jusName = jusNameArr[selectJusNum - 1];
				price = priceToArr[selectJusNum - 1];
				System.out.println();
				if (insertMoney < priceToArr[selectJusNum - 1]) {
					// 넣은 돈 부족
					System.err.println("돈이 부족합니다.");
					System.out.println("현재 금액 : " + insertMoney);
					break;
				} else if (stockCount[selectJusNum - 1] == 0) {
					// 자몽 재고
					System.err.println("재고가 부족합니다.");
					break;
				} else {
					System.out.print("정말 구매하시겠습니까 ?(네,아니요) : ");
					talk = sc.next();
					if (talk.equals("네")) {

						for (int i = 0; i < jusArr.size() + 1; i++) {
							if (jusArr.isEmpty() || jusArr.get(i).equals("")) {
								jusArr.add(i, jusName);
								jusArr.add(i, "");
								break;
							} else {
								continue;

							}
						}
						System.out.println(jusNameArr[selectJusNum - 1] + " 선택 완료.");
						stockCount[selectJusNum - 1] -= 1;
						break;

					} else if (talk.equals("아니요")) {
						System.err.println(jusNameArr[selectJusNum - 1] + " 선택 보류.");
						System.err.println("자판기로 돌아갑니다..");
						break;
					} else {
						System.err.println(jusNameArr[selectJusNum - 1] + " 선택 값 에러..");
						System.err.println("자판기로 돌아갑니다..");
						break;
					}
				}

			case 4:// 계산
				System.out.println("====선택한 음료 목록====");

				for (int i = 0; i < jusArr.size(); i++) {
					for (int j = 0; j < jusNameArr.length; j++) {
						if (jusArr.get(i).toString().equals(jusNameArr[j])) {
							jusCount[j]++;
							jusArr.set(i, "");
						} else {
							continue;
						}
					}
				}

				for (int i = 0; i < jusNameArr.length; i++) {
					System.out.println(jusNameArr[i] + " " + jusCount[i] + "개");
				}
				System.out.println("====================");
				sum = jusCount[0] * 1600 + jusCount[1] * 1700 + jusCount[2] * 1200;
				if (insertMoney < sum) {
					System.out.println("총가격 : " + sum);
					System.out.println("부족한 돈 : " + (sum - insertMoney));
					System.err.println("금액이 부족하여 구매할 수 없습니다.");
					break;
				} else if (insertMoney >= sum) {
					insertMoney -= sum;
					System.out.println("총가격 : " + sum);
					System.out.println("남은 금액: " + insertMoney);

					int amountTemp = insertMoney;

					System.out.println("===========거스름돈============");
					if (insertMoney / 5000 != 0) {
						amountTemp = insertMoney / 5000;
						insertMoney -= amountTemp * 5000;
						System.out.println("'5000원' : '" + amountTemp + "개'");
					}

					if (insertMoney / 1000 != 0) {
						amountTemp = insertMoney / 1000;
						insertMoney -= amountTemp * 1000;
						System.out.println("'1000원' : '" + amountTemp + "개'");
					}
					if (insertMoney / 500 != 0) {
						amountTemp = insertMoney / 500;
						insertMoney -= amountTemp * 500;
						System.out.println("'500원' : '" + amountTemp + "개'");
					}
					if (insertMoney / 100 != 0) {
						amountTemp = insertMoney / 100;
						insertMoney -= amountTemp * 100;
						System.out.println("'100원' : '" + amountTemp + "개'");
					}
					System.out.println("===========거스름돈============");

					System.out.println("구매 완료");
					insertMoney = 0;
					jusArr = new ArrayList<String>();
					jusCount[0] = 0;
					jusCount[1] = 0;
					jusCount[2] = 0;

					break;
				}
				break;
			case 5:// 추가금액 투입
				if (insertMoney >= 50000) {
					System.out.println("오만원권이상은 사용하실 수 없습니다. 10000원 5000원 1000원 동전을 이용해주세요.");
					System.out.print("금액을 입력해 주세요 : ");
					insertMoney = sc.nextInt();
				} else {
					System.out.print("금액을 입력해 주세요 : ");
					insertMoney += Integer.parseInt(sc.next());
					System.out.println("현재 금액 : " + insertMoney);
				}

				break;
			case 6:// 관리자 모드
				System.out.println("===========관리자모드============");
				System.out.println("1. 음료 변경 2. 음료 재고 변경");
				int adminNum = sc.nextInt();
				switch (adminNum) {
				case 1:
					System.out.print("변경할 음료 이름을 입력해주세요 : ");
					talk = sc.next();
					if (talk.equals(jusNameArr[adminNum - 1])) {
						System.out.println("'" + jusNameArr[adminNum - 1] + "'를 무엇으로 변경하시겠습니까?");
						System.out.print("변경 음료 이름 : ");
						jusNameArr[adminNum - 1] = sc.next();
						System.out.println("변경 완료");
					} else {
						System.out.println("없는 음료 이름입니다.");

					}
					break;

				case 2:
					System.out.println("===========재고수량===========");
					System.out.println("1." + jusNameArr[0] + "(" + stockCount[0] + ") 2." + jusNameArr[1] + "("
							+ stockCount[1] + ") 3." + jusNameArr[2] + "(" + stockCount[2] + ")");
					selectJusNum = sc.nextInt();
					switch (selectJusNum) {
					case 1:
					case 2:
					case 3:
						System.out.print("변경할 재고 수량 입력해주세요 : ");
						stockCount[selectJusNum - 1] = sc.nextInt();
						System.out.println("변경 완료");
						break;
					}
					System.out.println();
					break;
				}
			}

		}

	}

}
