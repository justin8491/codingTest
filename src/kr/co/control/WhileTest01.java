package kr.co.control;

public class WhileTest01 {

	public static void main(String[] args) {
		/*
		 * while(조건식){ // 조건식이 참이면 실행문으로 반복 실행문 EOF -> End Of File : 파일의 끝 }
		 */

//		int i = 0;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//
//		System.out.println("END");
		// 1부터 순차적으로 합을 구하는데
		// 합이 200이넘었을때의 j를 구하세요

//		int j = 1;
//		int sum = 0;
//		while (true) {
//			sum += j;
//			System.out.println(j + " 일때 sum = " + sum);
//			j++;
//			if (sum > 200)
//				break;
//
//		}
		// 상태 표현 방법
		int j = 0;
		int sum = 0;
		boolean done = true;

		while (done) {
			j++;
			sum += j;
			if (sum > 200)
				done = false;
			System.out.println(sum);
		}

	}

}
