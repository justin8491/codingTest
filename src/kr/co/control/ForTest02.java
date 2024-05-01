package kr.co.control;

public class ForTest02 {

	public static void main(String[] args) {
		// 1+2+3 ~~ +9+10 합을 구하기

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("i = " + i + "일때 sum = " + sum);
		}
		System.out.println(sum);
	}

}
