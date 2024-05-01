package kr.co.control;

public class SwitchTest01 {

	public static void main(String[] args) {
		// switch 구문 이해하기
		int num = 0;

		switch (num) {
		case 0:
			System.out.println("0입니다.");
			break;
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("0~2사이값이 아닙니다.");
			break;
		}

	}

}
