/*  ArrayList or LinkedList   : .add()  .get()  .set()  .remove()
 * 점심식사 메뉴 고르기 프로그램 ver1.0
 * 1. 메뉴추가 2. 메뉴고르기 3. 메뉴삭제 4.메뉴전체보기 99.종료
 * 메뉴는 최대 10가지, 초기값으로 김치볶음밥,짜장면은 입력한다.
 */
package kr.co.dong.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodTest01 {
	static Scanner scan = new Scanner(System.in);
	// 삭제할 메뉴저장을 delfood
	static ArrayList<String> delfood = new ArrayList<String>();

	static void initmenu(ArrayList<String> food) {// 초기값
		food.add("김치볶음밥");
		food.add("짜장면");
		food.add("새우버거");
		food.add("회덮밥");
	}

	public static int menu() {
		System.out.println("\n-------메뉴-------");
		System.out.println("1. 메뉴추가.");
		System.out.println("2. 메뉴선택.");
		System.out.println("3. 메뉴삭제");
		System.out.println("4. 전체보기");
		System.out.println("99. 종료");
		System.out.print("메뉴번호를 선택하세요 : ");

		return Integer.parseInt(scan.nextLine());
	}

	static void addfood(ArrayList<String> food) {
//		메뉴가 있는지 여부?
		System.out.println("추가할 메뉴를 입력하세요.!!");
		String tmp = "";
		do {
			tmp = scan.nextLine();
		} while (food.contains(tmp)); // .contains() T/F 리턴
		// 없는 메뉴이므로 추가
		food.add(tmp);

	}

	static void selectfood(ArrayList<String> food) {
		System.out.println("메뉴선택");
		printfood(food, 1); // 메뉴보여주고
		System.out.println(food.get(Integer.parseInt(scan.nextLine()) - 1));

	}

	static void removefood(ArrayList<String> food) {	
		int num = 0;
		System.out.println("메뉴삭제");
		printfood(food, 1);

		System.out.print("삭제를 메뉴번호를 입력하세요.");
//		참고scan.nextLine().charAt(0)
		num = Integer.parseInt(scan.nextLine());

		// 삭제할 메뉴번호를 food에서 가져온후 delfood에 저장한다.
		delfood.add(food.get(num - 1));

		food.remove(num - 1); // food에서 메뉴이름삭제

		System.out.println("삭제되었습니다.");

	}

	static void printfood(ArrayList<String> food, int num) {
		if (num == 1) {
			System.out.println("전체메뉴보기");
		} else {
			System.out.println("삭제메뉴보기");
		}
		for (int i = 0; i < food.size(); i++) {
			System.out.println((i + 1) + ". " + food.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>(); // 음식메뉴
		// 초기메뉴세팅
		initmenu(food);
		// 안내문 작성
		while (true) {
			switch (menu()) {
			case 1: // 메뉴추가
				addfood(food);
				break;
			case 2: // 메뉴고르기
				selectfood(food);
				break;
			case 3: // 메뉴삭제
				removefood(food);
				break;
			case 4: // 메뉴전체보기
				printfood(food, 1);
				break;
			case 5: // 삭제메뉴보기 (관리자용)
				printfood(delfood, 2);
			case 99: // 종료
				break;
			default: // 선택번호 다시
				break;
			}
		}

	}

}