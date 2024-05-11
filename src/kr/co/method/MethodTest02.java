package kr.co.method;

import java.util.Scanner;

public class MethodTest02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintCount pc = new PrintCount();
//		문자열과 휫수를 입력받아서 출력하는 함수 
		pc.print("나는 오늘 우동집에 갈거다.", 5);
		
		//함수로 단수 입력받아 구구단 출력
		
		pc.printGoogoodan(3);
		
	}

}
