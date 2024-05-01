package kr.co.check;

import java.util.Scanner;

public class Report15_08 {
	public static void main(String[] args) {
		/*
		 * 소스 : 음료자판기 V1.0 작성일 : 윤가을 클래스파일 : Report15 -> 수정이 일어나면 Report15_01 1 : 음료의종류는
		 * 3가지 - 이름 , 가격 , 재고수로 구성됨. 2 : 전원이 꺼질 때 까지 계속 동작합니다.
		 */

		Scanner scan = new Scanner(System.in);

		int money = 0;		
		
		int number = 0;

		String[] drink = { "펩시", "커피", "환타" }; // 음료의 종류

		int[] price = { 1500, 1500, 2500 };

		int[] jaego = { 7, 5, 9 };

		int lackmoney = 0;

		boolean power = false; // 자판기 while 조건

		boolean manager = false; // 관리자모드 while 조건

		String turnoff = "전원이 꺼집니다.";
		String managerend = "관리자모드를 종료합니다.";
		String correct = "올바른 번호를 입력해주세요.";
		String line = "===================================";

		while (!power) {
			System.out.println(line);
			System.out.printf("|0.금액넣기			  |%n|1.%s %d원 %d개		  | %n|2.%s %d원 %d개		  "
					+ "| %n|3.%s %d원 %d개		  | %n|4.거스름돈			  | %n|99.off				  |%n", 
					drink[0], price[0],jaego[0],drink[1], price[1],jaego[1],drink[2],price[2],jaego[2]);
			System.out.println(line);
			System.out.println("| 잔액 |" + money 	+"원			  |");
			System.out.println(line);
			number = scan.nextInt();
			switch (number) {
			case 0:
				System.out.println(line);
				System.out.println("금액을 넣어(입력)해주세요.");
				System.out.println(line);
				money = money + scan.nextInt(); // 넣은 금액을 입력하세요.
				System.out.println(money);
				break;
			case 1: case 2: case 3:// case[0] : coke
				if (jaego[number-1] > 0 && money >= price[number-1]) {
					jaego[number-1] = jaego[number-1] - 1;
					money = money - price[number-1];
					System.out.println(line);
					System.out.printf("%s, 남은 재고 %d개.%n", drink[number-1], jaego[number-1]);
				} else if (jaego[number-1] <= 0) {
					System.out.println(line);
					System.out.printf("%s의 재고가 없습니다. 다른걸 골라주세요.%n", drink[number-1]);
				} else {
					lackmoney = price[number-1] - money;
					System.out.println(line);
					System.out.printf("%s는 %d원입니다.%n", drink[number-1], price[number-1]);
					System.out.printf("%d원 부족합니다. 돈을 넣어주세요 %n",lackmoney);
				}
				break;
			case 4: // 거스름돈 오만원짜리 n장 만원짜리 n장 오천원짜리 n장 천원짜리n장 500원짜리n개 100원짜리n개 50원짜리n개 10원짜리 n개 형식으로 반환
					// 66660원이면 5만원짜리 1장 만원짜리1장 5천원짜리1장 천원짜리1장 500원짜리1장 100원짜리 1장 50원짜리1장 10원짜리 1장 
				int Omanwon = money / 50000;
				int manwon = (money%50000) / 10000;
				int ocheonwon = (money%10000) / 5000;
				int cheonwon = (money%5000) / 1000;
				int obagwon = (money%1000) / 500;
				int bagwon = (money%500) / 100;
				int oshibwon = (money%100) / 50;
				int shibwon = (money%50);
				System.out.println(line);
				System.out.printf("거스름돈	%d원.%n", money);
				System.out.println(line);
				System.out.printf("5만원짜리 %d개, 만원짜리 %d개, 5천원짜리%d개, 천원짜리%d개,%n500원짜리%d개, 100원짜리%d개, 50원짜리%d개, 10원짜리 %d개로 반환합니다%n"
						,Omanwon,manwon,ocheonwon,cheonwon,obagwon,bagwon,oshibwon,shibwon);
				money = 0;
				break;
			case 77: // 보기에 표시되지않는 관리자모드 실행 // 재고와 가격설정 가능하게.
				System.out.println(line);
				System.out.println("관리자 모드를 실행합니다.");
				manager = false;
				while (!manager) {
					System.out.println(line);
					System.out.println("수행하고자 하는 작업의 번호를 입력해주세요.");
					System.out.println("1.재고관리 2.가격관리 88.관리자모드종료");
					System.out.println(line);
					number = scan.nextInt();
					switch (number) {
					case 1:
						System.out.println(line);
						System.out.println("재고관리를 선택하셨습니다. 재고관리 하시려는 상품을 선택해주세요.");
						System.out.println("1.coke 2.cider 3.coffee 88.관리자모드종료");
						number = scan.nextInt();
						switch (number) {
						case 1: case 2: case 3:
							System.out.println(line);
							System.out.printf("현재 재고는 %d개 입니다. 재고의 수량을 입력해주세요.", jaego[number-1]);
							jaego[number-1] = scan.nextInt();
							System.out.println(line);
							System.out.printf("%s의 변경된 재고는 %d개입니다.%n", drink[number-1], jaego[number-1]);
							break;
						case 88:
							System.out.println(line);
							System.out.println(managerend);
							manager = true;
							break;
						default:
							System.out.println(line);
							System.out.println(correct);
							break;
						}// end of case1의 switch
						break;
					case 2:
						System.out.println("가격관리를 선택하셨습니다. 가격관리 하시려는 상품을 선택해주세요.");
						System.out.println("1.coke 2.cider 3.coffee 88.관리자모드종료");
						number = scan.nextInt();
						switch (number) {
						case 1: case 2: case 3:
							System.out.printf("%n현재 가격은 %d 입니다.수정된 가격을 입력해주세요.", price[number-1]);
							price[number-1] = scan.nextInt();
							System.out.printf("%s의 수정된 가격은 %d원입니다.%n", drink[number-1], price[number-1]);
							break;
						case 88:
							System.out.println(managerend);
							manager = true;
							break;
						default:
							System.out.println(line);
							System.out.println(correct);
							break;
						}
						break;
					case 88:
						System.out.println(line);
						System.out.println("종료를 선택하셨습니다.");
						System.out.println(managerend);
						manager = true;
						break;
					default:
						System.out.println(line);
						System.out.println(correct);
						break;
					} // end of case2의 switch
				}
				break;
			case 99:
				System.out.println("off를 선택하셨습니다.");
				System.out.println("이용해주셔서 감사합니다.");
				power = true;
				break;

			default:
				System.out.println(line);
				System.out.println(correct);
				break;
			} // end of switch구문
			if (number == 99) {
				power = true;
				System.out.println(turnoff);
				break;
			} else if (jaego[0] == 0 && jaego[1] == 0 && jaego[2] == 0) {
				System.out.println(line);
				System.out.println("모든 재고가 바닥났습니다.");
				System.out.printf("남은 거스름돈 %d원을 반환합니다.%n", money);
				System.out.println(turnoff);
				power = true;
				break;
			}

		} // end of while

	} // end of main
} // end of class