package kr.co.dong.bank;

import java.util.Scanner;

public class Bank implements AccountCoustomer {

	// 은행 계좌 클래스
	// - 계좌번호,예금주 이름, 잔액
	// - 예금한다,인출한다.
	private String accNum; // 계좌 번호
	private String accPwd; // 계좌 비밀번호
	private String accName; // 고객 이름
	private int balance; // 잔액

	static int serialNum = 0;
//	String[] history = new String[100];

	public Bank() {
	}

	public Bank(String accNum, String accPwd, String accName, int balance) {
		super();
		this.accNum = accNum;
		this.accPwd = accPwd;
		this.accName = accName;
		this.balance = balance;
		serialNum++;
	}

	@Override
	public Bank withdraw(Bank bank, int money, Scanner sc) throws Exception {
		System.out.println("출금 할 금액을 입력해주세요 : ");
		money = sc.nextInt();
		if (bank != null) {
			// 계좌 있는 경우
			if (bank.getBalance() != 0 && bank.getBalance() > money) {
				// 잔액 부족한데 출금 시
				bank.setBalance(this.balance -= money);
				System.out.println("출금 금액 : " + money);
				System.out.println("출금 후 잔액 : " + bank.getBalance());
			} else {
				System.out.println("잔액이 부족합니다. 잔액 확인 후 다시 사용해주세요.");
			}
		} else {
			// 계좌 없는 경우
			System.out.println("계좌가 없습니다. 계좌 개설 후 이용 부탁드립니다.");
		}
		return bank;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
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

	public String getAccPwd() {
		return accPwd;
	}

	public void setAccPwd(String accPwd) {
		this.accPwd = accPwd;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public void getInfo() {
		System.out.println("---- 계좌정보 ----");
		System.out.println("계좌번호 : " + this.accNum);
		System.out.println("예금주명 : " + this.accName);
		System.out.println("계좌잔액 : " + this.balance);
	}



	@Override
	public Bank deposit(Bank bank, int money, Scanner sc) {
		if (bank != null) {
			// 계좌 있는 경우
			System.out.println("입금 할 금액을 입력해주세요 : ");
			money = sc.nextInt();
			bank.setBalance(bank.getBalance() + money);
			System.out.println("입금 금액 : " + money);
			System.out.println("입금 후 잔액 : " + bank.getBalance());
		} else {
			// 계좌 없는 경우
			System.out.println("계좌가 없습니다. 계좌 개설 후 이용 부탁드립니다.");
		}
		return bank;
	}

	@Override
	public void checkAccount(Account account, Bank bank) {
		// TODO Auto-generated method stub
		
	}

}
