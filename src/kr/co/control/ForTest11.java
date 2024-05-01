package kr.co.control;

public class ForTest11 {

	public static void main(String[] args) {
		// 구구단 작성

//		int dan = 1;
//		// 1
//		for (dan = 2; dan <= 9; dan++) {
//			// 8
//			System.out.println("==========================================");
//			for (int i = 1; i <= 9; i++) {
//				// 72
//				System.out.println(dan + " X " + i + " = " + dan * i);
//				// 72
//			}
//			// 8
//		}
		// 1

		int dan = 1;
		for (dan = 2; dan <= 9; dan++) {
			System.out.println("[" + dan + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + " X " + i + " = " + dan * i + " : ");
			}
			System.out.println();
		}
		System.out.println("============== 구구단 끝 ==============");
	}

}
