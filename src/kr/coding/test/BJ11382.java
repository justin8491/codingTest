package kr.coding.test;

import java.util.*;

public class BJ11382 {

	public static void main(String[] args) {
		/*
		 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
		 */
		Scanner sc = new Scanner(System.in);
		long A = 0;
		long B = 0;
		long C = 0;
		long sum = 0;

		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();

		sum += A;
		sum += B;
		sum += C;
		System.out.println(sum);
	}

}
