package kr.co.control;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {
		/*
		 * 랜덤으로 주사위를 돌려서 눈금을 출력하세요
		 */

		int dice = (int) (Math.random() * 6 + 1);

		switch (dice) {
		case 1:
			System.out.println("주사위 눈금1");
			break;
		case 2:
			System.out.println("주사위 눈금2");
			break;
		case 3:
			System.out.println("주사위 눈금3");
			break;
		case 4:
			System.out.println("주사위 눈금4");
			break;
		case 5:
			System.out.println("주사위 눈금5");
			break;
		case 6:
			System.out.println("주사위 눈금6");
			break;
		}

	}

}
