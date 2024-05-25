package kr.co.dong.bank;

public abstract class Account_defult implements AccountCoustomer {

	// 은행 계좌 클래스
	// - 계좌번호,예금주 이름, 잔액
	// - 예금한다,인출한다.
	private String accNum;
	private String accName;
	private int balance;

	String[] history = new String[100];

	public Account_defult() {
	}

	public Account_defult(String accNum, String accName, int balance) {
		super();
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public int deposit(int amount) {
		this.balance += amount;
		return 1;
	}

	@Override
	public int withdraw(int amount) throws Exception {
		if (balance > amount) {
			this.balance -= amount;
		} else {
			throw new Exception("잔액이 부족합니다.");
		}
		return amount;
	}

	public Account_defult tranSTHistory(Account_defult account) {
		return null;
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

}
