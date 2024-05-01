package kr.co.control;

import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) {
		// switch case 를 이용하여 간단한 사전만들기
		// 영어단어를 입력하면 그 단어에 맞는 한글의미를 출력
		// desk, chair, pencil, mouse
		// 4개중에 없는 단어를 입력하면 " 사전에 없는 단어입니다." 출력

		Scanner sc = new Scanner(System.in);
		String danA = "";

		danA = sc.nextLine();

		switch (danA) {
		case "desk":
			System.out.println("책상 일겁니다");
			break;
		case "chair":
			System.out.println("의자 일겁니다");
			break;
		case "pencil":
			System.out.println("연필 일겁니다");
			break;
		case "mouse":
			System.out.println("마우스 일겁니다");
			break;
		default:
			System.out.println("사전에 없는 단어입니다.");
			break;
		}

	}

}
