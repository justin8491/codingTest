package kr.co.check;

import java.util.ArrayList;
import java.util.Scanner;

public class Report14_03 {

	public static void main(String[] args) {
		/*
		 * 소스 : 음료자판기V1.0 작성일 : 2024-04-29 작성자 : 유종현 클래스파일 : 홍길동의 번호가 33인경우 Report33 ->
		 * 수정이 일어나면 Report33_01 1. 음료의 종류는 3가지 - 이름, 가격, 재고수로 구성됨 2. 전원이 꺼질때까지 계속 동작합니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// 이름, 재고 수, 가격 1.자몽에이드(1600) 2.생강에이드(1700) 3.청포도에이드(1200)
		String jusName = "";
		String jusName1 = "자몽에이드";
		String jusName2 = "생강에이드";
		String jusName3 = "청포도에이드";
		int jStockCount = 2; // 자몽 에이드
		int sStockCount = 3; // 생강 에이드
		int cStockCount = 4; // 청포도 에이드
		ArrayList<String> jusArr = new ArrayList<String>();

		// 음료 가격
		int price = 0;
		// 음료 가격 합계
		int sum = 0; // 합계
		// 선택 주스
		String selectJusNum = "";
		// 넣을 돈
		int insertMoney = 0;

		// 기타 변수
		String talk = "";

		// 입력
		while (true) { // 전원이 꺼질리가 없다
			// 음료 초기화값
			jusArr.add(0, "");
			jusArr.add(1, "");
			jusArr.add(2, "");
			// 돈 삽입

			System.out.println("============================== 자판기 ==============================");
			System.out.println("1." + jusName1 + "(1600)" + "(" + (jStockCount != 0 ? jStockCount : "재고없음") + ")"
					+ " 2." + jusName2 + "(1700)" + "(" + (sStockCount != 0 ? sStockCount : "재고없음") + ")" + " 3."
					+ jusName3 + "(1200)" + "(" + (cStockCount != 0 ? cStockCount : "재고없음") + ")" + " 4.계산 5.금액 투입 ");
			System.out.print("선택할 값 : ");

			selectJusNum = sc.next();

			switch (selectJusNum) {
			case "1":// 자몽
				jusName = jusName1;
				price = 1600;
				System.out.println();
				if (insertMoney < price) {
					// 넣은 돈 부족
					System.err.println("돈이 부족합니다.");
					System.out.println("현재 금액 : " + insertMoney);
					break;
				} else if (jStockCount == 0) {
					// 자몽 재고
					System.err.println("재고가 부족합니다.");
					break;
				} else {
					System.out.print("정말 구매하시겠습니까 ?(네,아니요) : ");
					talk = sc.next();
					if (talk.equals("네")) {

						for (int i = 0; i < jusArr.size() + 1; i++) {
							if (jusArr.isEmpty()) {
								continue;
							} else {
								jusArr.add(i, jusName);
								break;
							}
						}
						System.out.println(jusName1 + " 선택 완료.");
						jStockCount -= 1;
						break;

					} else if (talk.equals("아니요")) {
						System.out.println(jusName1 + " 선택 보류.");
						System.out.println("자판기로 돌아갑니다..");
						break;
					} else {
						System.out.println(jusName1 + " 선택 값 에러..");
						System.out.println("자판기로 돌아갑니다..");
					}
				}

				break;
			case "2":// 생강
				jusName = jusName2;
				price = 1700;
				System.out.println();
				if (insertMoney < price) {
					// 넣은 돈 부족
					System.err.println("돈이 부족합니다.");
					System.out.println("현재 금액 : " + insertMoney);
					break;
				} else if (sStockCount <= 0) {
					// 자몽 재고
					System.err.println("재고가 부족합니다.");
					break;
				} else {
					System.out.print("정말 구매하시겠습니까 ?(네,아니요) : ");
					talk = sc.next();
					if (talk.equals("네")) {
						for (int i = 0; i < jusArr.size(); i++) {
							if (jusArr.isEmpty()) {
								continue;
							} else {
								jusArr.add(i, jusName);
								break;
							}
						}
						System.out.println(jusName2 + " 선택 완료.");
						sStockCount -= 1;
						break;
					} else if (talk.equals("아니요")) {
						System.out.println(jusName2 + " 선택 보류.");
						System.out.println("자판기로 돌아갑니다..");
						break;
					}
				}
			case "3":// 청포도
				jusName = jusName3;
				price = 1200;
				System.out.println();
				if (insertMoney < price) {
					// 넣은 돈 부족
					System.err.println("돈이 부족합니다.");
					System.out.println("현재 금액 : " + insertMoney);
					break;
				} else if (cStockCount == 0) {
					// 자몽 재고
					System.err.println("재고가 부족합니다.");
					break;
				} else {
					System.out.print("정말 구매하시겠습니까 ?(네,아니요) : ");
					talk = sc.next();
					if (talk.equals("네")) {
						for (int i = 0; i < jusArr.size(); i++) {
							if (jusArr.isEmpty()) {
								continue;
							} else {
								jusArr.add(i, jusName);
								break;
							}
						}
						cStockCount -= 1;
						System.out.println(jusName3 + " 선택 완료.");
						break;

					} else if (talk.equals("아니요")) {
						System.out.println(jusName3 + " 선택 보류.");
						System.out.println("자판기로 돌아갑니다..");
						break;
					}
				}
				break;
			case "4":// 계산
				System.out.println("====선택한 음료 목록====");
				int jamong = 0;
				int saanggang = 0;
				int ceung = 0;
				for (int i = 0; i < jusArr.size(); i++) {

					if (jusArr.get(i).toString().equals(jusName1)) {
						jamong++;
					} else if (jusArr.get(i).toString().equals(jusName2)) {
						saanggang++;
					} else if (jusArr.get(i).toString().equals(jusName3)) {
						ceung++;
					} else if (jusArr.isEmpty()) {
						continue;
					}

				}

				System.out.println(jusName1 + " " + jamong + "개");
				System.out.println(jusName2 + " " + saanggang + "개");
				System.out.println(jusName3 + " " + ceung + "개");
				System.out.println("====================");
				sum = jamong * 1600 + saanggang * 1700 + ceung * 1200;
				if (insertMoney < sum) {
					System.out.println("총가격 : " + sum);
					System.out.println("부족한 돈 : " + (sum - insertMoney));
					System.err.println("금액이 부족하여 구매할 수 없습니다.");
					break;
				} else if (insertMoney > sum || insertMoney == sum) {
					int oCheon = 0;
					int cheon = 0;
					int oback = 0;
					int back = 0;
					insertMoney -= sum;
					System.out.println("총가격 : " + sum);
					System.out.println("남은 금액: " + insertMoney);

					oCheon = (int) (insertMoney / 5000);
					insertMoney = insertMoney - oCheon * 5000;
					cheon = (int) (insertMoney / 1000);
					insertMoney = insertMoney - cheon * 1000;
					oback = (int) (insertMoney / 500);
					insertMoney = insertMoney - oback * 500;
					back = (int) (insertMoney / 100);
					insertMoney = insertMoney - back * 100;

					System.out.println("===========거스름돈============");
					System.out.println("'5000원' : '" + oCheon + "' \n'1000원' : '" + cheon + "' \n'500원' : '" + oback
							+ "' \n'100원' : '" + back + "'");
					System.out.println("===========거스름돈============");
					System.out.println("구매 완료");
					insertMoney = 0;
					jusArr = new ArrayList<String>();

					break;
				}
				break;
			case "5":// 추가금액 투입
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
			case "6":// 관리자 모드
				System.out.println("===========관리자모드============");
				System.out.println("1. 음료 변경 2. 음료 재고 변경");
				String adminNum = sc.next();
				switch (adminNum) {
				case "1":
					System.out.print("변경할 음료 이름을 입력해주세요 : ");
					talk = sc.next();
					if (talk.equals(jusName1)) {
						System.out.println("'" + jusName1 + "'를 무엇으로 변경하시겠습니까?");
						System.out.print("변경 음료 이름 : ");
						jusName1 = sc.next();
						System.out.println("변경 완료");
					} else if (talk.equals(jusName2)) {
						System.out.println("'" + jusName2 + "'를 무엇으로 변경하시겠습니까?");
						System.out.print("변경 음료 이름 : ");
						jusName2 = sc.next();
						System.out.println("변경 완료");
					} else if (talk.equals(jusName3)) {
						System.out.println("'" + jusName3 + "'를 무엇으로 변경하시겠습니까?");
						System.out.print("변경 음료 이름 : ");
						jusName2 = sc.next();
						System.out.println("변경 완료");
					} else {
						System.out.println("없는 음료 이름입니다.");
					}
					break;
				case "2":
					System.out.println("===========재고수량===========");
					System.out.println("1." + jusName1 + "(" + jStockCount + ") 2." + jusName2 + "(" + sStockCount
							+ ") 3." + jusName3 + "(" + cStockCount + ")");
					talk = sc.next();
					switch (talk) {
					case "1":
						System.out.print("변경할 재고 수량 입력해주세요 : ");
						jStockCount = sc.nextInt();
						System.out.println("변경 완료");
						break;
					case "2":
						System.out.print("변경할 재고 수량 입력해주세요 : ");
						sStockCount = sc.nextInt();
						System.out.println("변경 완료");
						break;
					case "3":
						System.out.print("변경할 재고 수량 입력해주세요 : ");
						cStockCount = sc.nextInt();
						System.out.println("변경 완료");
						break;
					}
					break;
				}
				System.out.println();
				break;
			}

		}

	}

}
