package kr.co.oop.test;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
			// 위 두줄을 한줄로 작성할 수 있다.
//			throw new Exception("고의로 발생시켰음."); 
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
