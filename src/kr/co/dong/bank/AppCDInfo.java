package kr.co.dong.bank;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;

public class AppCDInfo implements Lendable {
	
	public static void main(String[] args) {

	}

	@Override
	public void checkOut(String borrower, String date) {
		System.out.println("체크아웃합니다.");
	}

	@Override
	public void checkIn() {
		
		System.out.println("체크인합니다.");
		
	}

}
