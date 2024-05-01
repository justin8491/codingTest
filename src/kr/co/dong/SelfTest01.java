package kr.co.dong;

import java.util.Date;
import java.util.Scanner;

public class SelfTest01 {

	public static void main(String[] args) {
		// ------------------ Object --------------------
		Scanner sc = new Scanner(System.in);
		Date date = new Date();

		// ------------------ 변수 선언 -------------------
		
		//입력받을 이름, 주민번호
		String name = "";
		String pepleNum = "";
		
		//현재 날짜 기준 성인 커트라인
		int adult = (date.getYear() + 1900) - 19;
		
		String year = "";
		String ifYear = "";
		
		// ------------------ Start ---------------------
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();

		System.out.print("주민번호 등록 : ");
		pepleNum = sc.nextLine();

		year = pepleNum.substring(0, 2);

		if (Integer.parseInt(year) > 24) {
			ifYear = "19" + year;
		} else {
			ifYear = "20" + year;
		}
		year = ifYear;

		if (adult > Integer.parseInt(year)) {
			System.out.println(name + "님은 성인 입니다.");
		} else {
			System.out.println(name + "님은 성인이 아닙니다.");
		}
		
		// ------------------- End -----------------------

	}

}
