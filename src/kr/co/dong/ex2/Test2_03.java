package kr.co.dong.ex2;

public class Test2_03 {

	public static void main(String[] args) {
		int num1 = 3;
		int sum = 0;

		num1 = num1 + 5;
		num1 += 5;

		sum = sum + 1;

		System.out.println(sum);
		sum++;
		System.out.println(sum);
		System.out.println(sum++);
		System.out.println(sum);
		System.out.println(++sum);

	}

}
