//package kr.co.dong.bank;
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		Account ac1 = new Account("302-0649-9099-11", "유종현", 30000);
//		Account ac2 = new Account();
//		ac2.setAccNum("123-1234-123");
//		ac2.setAccName("홍길동");
//		ac2.setBalance(534200);
//
////		toString() 에 의한 객체를 문자열로 변환
//		System.out.println(ac2);
////		계좌정보 출력 메소드
////		ac1.getInfo();
//		ac2.getInfo();
//
//		ac1.deposit(3000);
//		ac2.deposit(4000000);
//
////		ac1.getInfo();
//		ac2.getInfo();
//
//		try {
//			System.out.println("Deposit ...");
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ac2.getInfo();
//
////		지금까지 개발한 소스를 수행하는 중에 발생할 수 있는
////		다소 미약한 오류를 모아보기 -> Exception 클래스
////		- 메소드에 throws Exception 선언되어 있음
////		-> 사용시 try catch()구문으로 해결
//
////		임의로 인출한다() 메소드를 Exception 처리로 변경해보기
//
//		try {
//			ac1.withdraw(5000000);
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		ac1.getInfo();
//	}
//
//}
