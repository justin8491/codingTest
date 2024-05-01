package kr.co.check;

import java.util.Scanner;

/* 소스 : 음료자판기V1.0
 * 작성일 : 24.04.29
 * 작성자 : 김철현
 * 클래스파일 : 홍길동의 번호가 33인경우 Report33
 *          -> 수정이 일어나면 Report33_01
 *     1. 음료의 종류는 3가지 
 *   - 이름, 가격, 재고수로 구성됨
 *   2. 전원이 꺼질때까지 계속 동작합니다.
 */
public class Report06_02 {
	public static void main(String[] args) {

		String cola = "콜라";
		String cider = "사이다";
		String juice = "주스";

		int colaPrice = 1000;
		int ciderPrice = 1200;
		int juicePrice = 1500;

		int colastorage = 5;
		int cidertorage = 2;
		int juicetorage = 10;

		
		int choice = 0;
		int balance = 0;
		int money = 0;

		Scanner scan = new Scanner(System.in);

		
		while (true) {
			
			
			System.out.println("1.콜라 2.사이다 3.주스 4.금액 투입 5.종료");
			System.out.print("메뉴 선택 : ");
						
			choice = Integer.parseInt(scan.nextLine());
										
			 if (choice == 5) {
				System.out.println("전원 Off");
				System.out.println("잔돈 "+money+"원 반환");
				break;
			}			
			 else if (choice == 4) {
				 System.out.print("돈을 투입하시오 : ");
					money +=  Integer.parseInt(scan.nextLine());
			}
			 
					 
			 else if ((colastorage <= 0 && choice == 1)||(cidertorage <= 0 && choice == 2)||(juicetorage <= 0 && choice == 3)){
				 System.out.println("재고가 모두 떨어졌습니다.");	
			}		
					
			 else if (choice == 1) {
				 System.out.println(cola + " 선택");			
				
					if (money < colaPrice && choice == 1) {
						System.out.println("금액이 부족합니다.");
						break;
					}
				 
					colastorage = colastorage - 1;
				System.out.println(colaPrice + "원 지불하였습니다.");
				money = money - colaPrice;
				System.out.println("잔돈은 "+money+"원 입니다.");
				System.out.println("현재 남은 콜라 재고 : " + colastorage);

			} else if (choice == 2) {
				System.out.println(cider + " 선택");
				
				
				if (money < ciderPrice && choice == 2) {
					 System.out.println("금액이 부족합니다.");
					 break; 
					}
				
				cidertorage = cidertorage - 1;
				System.out.println(ciderPrice + "원 지불하였습니다.");
				money = money - ciderPrice;
				System.out.println("잔돈은 "+money+"원 입니다.");
				System.out.println("현재 남은 사이다 재고 : " + cidertorage);
			} 
			else if (choice == 3) {
				System.out.println(juice + " 선택");
			
				if (money < juicePrice && choice == 3) {
					 System.out.println("금액이 부족합니다.");
					 break;
					}
				
				juicetorage = juicetorage - 1;
				System.out.println(juicePrice + "원 지불하였습니다.");
				money = money - juicePrice;
				System.out.println("잔돈은 "+money+"원 입니다.");
				System.out.println("현재 남은 주스 재고 : " + juicetorage);
			}
			else if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 ) {
				System.out.println("번호가 올바르지 않습니다.");
			}
			 
			System.out.println();
		}

	}
}
