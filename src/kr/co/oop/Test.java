package kr.co.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		Car car = new Car();
//		System.out.print("차량 입력 : ");
//		car.run(sc.next());

//		Car bigCar = new BigCar();
//
//		Car smallCar = new SmallCar();
//
//		bigCar.setCarName("페라리");
//		smallCar.setCarName("람보르기니");
//
//		System.out.println(bigCar.getCarName());
//		System.out.println(smallCar.getCarName());

//		int[] randomNumArr = new int[10];
//
//		for (int i = 0; i < randomNumArr.length; i++) {
//			randomNumArr[i] = (int) (Math.random() * 9 + 1);
//		}
//		System.out.println(Arrays.toString(randomNumArr));
//		sortArr(randomNumArr);
//		System.out.println(Arrays.toString(randomNumArr));
//		for (long i = 0; i <= 10; i++) {
//			recursiveCall(i);
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		recursiveCall(a);
		long b = Integer.parseInt(st.nextToken());
		recursiveCall(b);
		long c = Integer.parseInt(st.nextToken());
		recursiveCall(c);

	}

	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	static void recursiveCall(long num) {
		if (num == 0 || num == -10)
			return;
		System.out.println(num);
		recursiveCall(--num);

	}

}
