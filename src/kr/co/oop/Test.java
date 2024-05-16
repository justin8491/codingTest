package kr.co.oop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
//		System.out.print("차량 입력 : ");
//		car.run(sc.next());

		Car bigCar = new BigCar();

		Car smallCar = new SmallCar();

		bigCar.setCarName("페라리");
		smallCar.setCarName("람보르기니");

		System.out.println(bigCar.getCarName());
		System.out.println(smallCar.getCarName());

	}

}
