package kr.co.control;

public class ForTest01 {

	public static void main(String[] args) {
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");
//		System.out.println("4교시 배고프당!");

		for (int i = 0; i <= 9; i++) {
			System.out.print((i + 1) + ", ");
		}
		System.out.println();
		for (int i = 0; i <= 9; i++) {

			if (i == 9) {
				System.out.println((i + 1));
				break;
			}
			System.out.print((i + 1) + ", ");

		}
	}

}
