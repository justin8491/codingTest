package kr.co.dong.bank;

import java.util.Scanner;

public class Account implements AccountCoustomer {

	// 은행 계좌 클래스
	// - 계좌번호,예금주 이름, 잔액
	// - 예금한다,인출한다.

	private String accName; // 이름
	private String accGender; // 성별
	private int balance; // 잔액
	private String accPwd; // 비밀번호 4자리

	private Bank[] accNum;

	public Account() {
	}

	public Account(String accName, String accGender, String accPwd) {
		super();
		this.accName = accName;
		this.accGender = accGender;
		this.accPwd = accPwd;
	}

//	@Override
//	public int withdraw(int amount) throws Exception {
//		if (balance > amount) {
//			this.balance -= amount;
//		} else {
//			throw new Exception("잔액이 부족합니다.");
//		}
//		return amount;
//	}

	public String getAccPwd() {
		return accPwd;
	}

	public void setAccPwd(String accPwd) {
		this.accPwd = accPwd;
	}

	public Account tranSTHistory(Account account) {
		return null;
	}

	public String getAccGender() {
		return accGender;
	}

	public void setAccGender(String accGender) {
		this.accGender = accGender;
	}

	public Bank[] getAccNum() {
		return accNum;
	}

	public void setAccNum(Bank[] accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accName=" + accName + ", accGender=" + accGender + ", balance=" + balance + ", accPwd="
				+ accPwd;
	}

//	public void getInfo() {
//		System.out.println("---- 계좌정보 ----");
//		System.out.println("계좌번호 : " + this.accNum);
//		System.out.println("예금주명 : " + this.accName);
//		System.out.println("계좌잔액 : " + this.balance);
//	}

	@Override
	public void checkAccount(Account account, Bank bank) {
		
	}

	@Override
	public Bank withdraw(Bank bank, int money, Scanner sc) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank deposit(Bank bank, int money, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Bank createAccount(String accName) {
//		if (accName == null) {
//			System.out.println("고객 정보가 없습니다. 고객 등록을 부탁드립니다.");
//			return null;
//		}
//		return null;
//	}

}
