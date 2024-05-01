package kr.co.control;

import java.util.Scanner;

public class TestCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		int x = 0;
//		if (x > 10 && x < 20) {}
		// char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		char ch = ' ';
//		if (ch == ' ' && ch != ' ') {}
		// char형 변수 ch가 'x' 또는 'X'일 때 true 조건식
//		char ch = ' ';
//		if(ch == 'x' || ch == 'X') {}
		// char형 변수 ch가 숫자 0~ 9 일 때 true 조건식
//		char ch = ' ';
//		if(ch >= '0' && ch <= '9') {}
		// char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		char ch = ' ';
//		if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {}
		// int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
//		int year = 804;
//		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {}
		// boolean형 변수 powerOn가 false일 때 true인 조건식
//		boolean powerOn = false; if(!powerOn) {};
		// 문자열 참조변수 str이 "yes"일 때 true인 조건식
//		String str = "yes"; if(str.equals(str)) {}
		// 1부터 20까지의 정수에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
//		int sum = 0;
//		for (int i = 1; i <= 20; i++) {
//			if (i % 3 != 0 && i % 2 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		// 1+(1+2)+(1+2+3)~~ 10까지의 결과를 계산
//		int temp1 = 0, temp2 = 0, sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			temp1 = i;
//			temp2 = temp2 + i;
//			sum += temp2;
//		}
//		System.out.println(sum);
		// 1+(-2)+3+(-4)~~ 총합 100이상 까지 몇번 더해야 하는지
//		int sum = 0;
//		int cnt = 0;
//		for (int i = 1; sum < 100; i++) {
//			if (i % 2 == 0) {
//				cnt++;
//				sum += i * (-1);
//				System.out.println(sum);
//			} else {
//				cnt++;
//				sum += i;
//				System.out.println(sum);
//			}
//
//		}
//		System.out.println("몇까지 더했는지 휫수 : " + cnt);
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		// 4-5
//		int cnt = -1;
//		int cnt2 = 0;
//		while (cnt <= 10) {// 행 1
//			cnt++;
//			while (true) {
//				cnt2++;
//				if (cnt2 >= cnt) { // 열(별개수)
//					cnt2 = 0;
//					break;
//
//				} else {
//
//					System.out.print("*");
//				}
//
//			}
//			System.out.println();
//
//		}
//		int cnt = 0;
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if (i + j == 6) {
//					System.out.print("1번 주사위 : " + i + " : ");
//					System.out.println("2번 주사위 : " + j);
//					cnt++;
//				}
//			}
//		}
//		System.out.println("경우의 수 : " + cnt);
		// 4-8
//		int x = 0, y = 0;
//		int temp1 = 0, temp2 = 0;
//		for (x = 0; x < 10; x++) {
//			for (y = 0; y < 10; y++) {
//				if (x * 2 + y * 4 == 10) {
//					System.out.println(" x = " + x + " y = " + y);
//				}
//			}
//		}
		// 4-9
//		String str = "12345";
//		int sum = 0;
//		for (int i = 0; i < str.length(); i++) {
//			sum += Integer.parseInt(str.charAt(i) + "");
//		}
//		System.out.println("sum=" + sum);
		// 4-10
//		int num = 12345;
//		int sum = 0;
//
//		String numToString = num + "";
//
//		for (int i = 0; i < numToString.length(); i++) {
//			sum += Integer.parseInt(numToString.charAt(i) + "");
//		}
//
//		System.out.println("sum=" + sum);
		// 4-11
		// 피보나치 수열 시작의 첫 두 숫자 1 ,1
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;// 세번째값
//
//		System.out.print(num1 + "," + num2);
//
//		for (int i = 0; i < 8; i++) {
//
//			// num1 + num2 출력
//			
//			// num1 + num2 값 저장
//			num3 = num2 + num1;
//			num1 = num2;
//			num2 = num3;
//			System.out.print("," + num3);
//
//		}
		// 4-11 xxxx 패스
//		for (int i = 1; i < 9; i++) {
//			int cnt = 0;
//			for (int j = 2; j <= 10; j++) {
//				cnt++;
//				if(i == 3) {
//					System.out.println();
//					System.out.println();
//					System.out.println();
//				}
//				System.out.print(j + "*" + i + "=" + j * i + "      ");
//			}
//			System.out.println();
//		}
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//
//		// 반복문과 charAt 를 이용해서 문자열의 문자를
//		// 하나씩 읽어서 검사한다.
//		for (int i = 0; i < value.length(); i++) {
//			ch = value.charAt(i);
//			if (ch >= '1' && ch <= '9') {
//				isNumber = true;
//			} else {
//				isNumber = false;
//				break;
//			}
//		}
//		if (isNumber) {
//			System.out.println(value + "는 숫자입니다.");
//		} else {
//			System.out.println(value + "는 숫자가 아닙니다.");
//		}
		// 1~100사이에 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int) (Math.random() * 100 + 1);
//		int input = 0; // 사용자입력 공간
//		int count = 0; // 시도휫수를 세기위한 변수
//
//		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.print("1과 100사이의 값을 입력하세요 : ");
//			input = sc.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//
//			if (input < answer) {
//				System.out.println("더 큰 수를 입력하세요.");
//				count++;
//			} else if (input > answer) {
//				System.out.println("더 작은 수를 입력하세요.");
//				count++;
//			} else if (input == answer) {
//				System.out.println("맞췄습니다.");
//				break;
//			}
//		} while (true);

//		int number = 12321;
//		int tmp = number;
//
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//
//		String rotate = number + ""; // String 값으로
//		String tempToString = "";
//		int i = rotate.length()-1;
//		while (tmp != 0) {
//			// 코드
//			String temp = "";
//			if (i >= 0) {
//				temp = rotate.charAt(i) + "";
//				tempToString += temp;
//				i--;
//				System.out.println("tempToString 값 : " + tempToString);
//			} else {
//				result = Integer.parseInt(tempToString);
//				break;
//			}
//
//		}
//
//		if (number == result) {
//			System.out.println(number + "는 회문수 입니다.");
//		} else {
//			System.out.println(number + "는 회문수가 아닙니다.");
//		}
//		int number = 12321;
//		int tmp = number;
//
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//
//		while (tmp != 0) {
//			// 코드
//			result = result * 10 + (tmp % 10);// 0 + 1
//			tmp /= 10;
//			System.out.println(result);
//		}
//
//		if (number == result) {
//			System.out.println(number + "는 회문수 입니다.");
//		} else {
//			System.err.println(number + "는 회문수가 아닙니다.");
//		}
	}
}
