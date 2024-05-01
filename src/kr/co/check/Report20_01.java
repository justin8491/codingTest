package kr.co.check;

import java.util.Scanner;

public class Report20_01 {
	public static void main(String[] args) {

		String menu[] = { "코카콜라", "펩시", "사이다" };
		long price[] = { 1500, 1800, 1200 };
		int stock[] = { 1, 1, 1 };
		int Number = 0;
		long jibul = 0L, lose = 0L, namuji = 0L;
		boolean shutdown = false, chaack = false;
		Scanner scan = new Scanner(System.in);

		while (!shutdown) {
// 출력파트
			System.out.println("==========menu===========");
			for (int i = 0; i < menu.length; i++) {
				System.out.print((i + 1) + "\t");
				System.out.print(menu[i] + "\t");
				System.out.print(price[i] + "\t");
				System.out.print(stock[i] + "\n");
			}
			System.out.println();
			System.out.println("잔돈반환(66)			강제종료(99)");
			System.out.print("선택: ");
			Number = scan.nextInt() - 1;

			if (Number == 98) {
				shutdown = true;

			} else if (0 <= Number && Number != 65 && Number != 77 && Number != 98) {

//사용자 입력 받은 값으로 재고 차감 및 계산하기
				if (stock[Number] == 0) {
					System.out.println("이 제품은 품절 상품입니다.");

				} else if (stock[Number] > 0) {
					System.out.printf("%s에 대한 %d금액을 지불해주시기 바랍니다. : ", menu[Number], price[Number]);
					jibul = scan.nextLong() + namuji;
//				System.out.println(jibul);

					// 금액이 부족할때 어떻게든 받아내기 (그지 정신)

					if (jibul < price[Number]) {
						do {

							lose = price[Number] - jibul; // 부족한 돈
							System.out.printf("손님 좋은 말 할때 남은 금액 내주세요 ^^ : %d", lose);
							System.out.print("주세요 : ");
							if (jibul >= price[Number]) {
								namuji = jibul - lose;
								jibul = 0;
								chaack = true;
							}

							jibul += scan.nextLong();

						} while (!chaack);
						stock[Number]--;
						jibul = 0;
						System.out.println(menu[Number] + "을 상품 가져가주세용");
						System.out.print("잔돈입니다 : ");
						System.out.print(namuji);

					} else if (jibul > price[Number]) {
						System.out.println(menu[Number] + "을 상품을 드리겠습니다.");
						System.out.print("잔돈입니다 : ");
						System.out.print(jibul - price[Number] + "\n");
						namuji = jibul - price[Number];// 남은 돈
						jibul = 0;// 지불 초기화

//					jibul = 0;
//					System.out.println("현재 금액 : ");
//					System.out.println(jibul);

						stock[Number]--;

					} else {
						System.out.println(menu[Number] + "을 상품을 드리겠습니다.");
						jibul = 0;
						stock[Number]--;
					}

				}

				// menu에 없는 값이 나올 경우
				if (Number > menu.length + 1) {
					System.out.println("메뉴에 없습니다.");
					break;

				}

//			System.out.println(jibul);

				// 재고 확인 코딩
				if (stock[0] == 0 && stock[1] == 0 && stock[2] == 0) {
					shutdown = true;
				}

			} /* else if(while문) end */else if (Number == 65) {
				System.out.printf("잔돈을 드리겠습니다. : %d", namuji);// 나머지 돈 반환
				shutdown = true;

			} else if (Number == 77) {

			}
		} // while

	}
}
