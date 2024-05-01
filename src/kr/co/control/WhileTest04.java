package kr.co.control;


public class WhileTest04 {

	public static void main(String[] args) {
		/*
		 * 랜덤 변수를 이용하여 1~100까지의 숫자중 50이 나오면 중지하는 프로그램을 작성하세요
		 */

		int random = 0;
		int cnt = 0;
		boolean stop = false;
		while (!stop) {
			cnt++;
			random = (int) (Math.random() * 100 + 1);
			
			
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("랜덤 숫자는 " + random + " 돌린 휫수는 '" + cnt + "'번 입니다.");
			if (random == 50) {
				stop = true;
			}
		}
		System.out.println("End");

	}

}
