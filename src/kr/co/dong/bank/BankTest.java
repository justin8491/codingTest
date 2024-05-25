package kr.co.dong.bank;

import java.time.LocalDate;
import java.util.Scanner;

public class BankTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int money = 0;
		int key = 0;
		Account account = null;
		Bank bank = null;
		LocalDate currentDate = LocalDate.now();

		System.out.println(currentDate);

//		processer(key, money, account, bank);
	}

	private static void processer(int key, int money, Account account, Bank bank) {
		boolean stop = false;
		while (!stop) {
			if (account != null) {
				key = userInfo();
			} else {
				key = info();
			}

			if (account != null) {// 고객정보가 있을 시

				switch (key) {
				case 1:
					// 계좌 개설
					createBank(account);
					break;
				case 2:
					// 입금하기
					if (bank != null) {
						// 계좌 있는 경우
					} else {
						// 계좌 없는 경우
						System.out.println("계좌가 없습니다. 계좌 개설 후 이용 부탁드립니다.");
					}
					break;
				case 3:
					// 출금하기
					if (bank != null) {
						// 계좌 있는 경우
						if (bank.getBalance() == 0 && bank.getBalance() > money) {

						}
					} else {
						// 계좌 없는 경우
						System.out.println("계좌가 없습니다. 계좌 개설 후 이용 부탁드립니다.");
					}
					break;
				}
			} else if (account == null) { // 고객정보가 없을 시
				System.out.println();
				switch (key) {
				case 1:
					// 고객등록
					account = createAccount();
					break;
				case 2:
					// 고객 정보 확인
					break;
				case 3:
					// 고객 해지
					break;
				}
			}

		}
	}

	private static Bank createBank(Account account) {
		// 계좌번호 302- ~~~ 시작으로 오늘 날짜 값 일련번호로 처리

		Bank bank = new Bank("302-", account.getAccPwd(), account.getAccName(), 0);
		return bank;
	}

	private static Account createAccount() {
		// 이름 성별 잔액
		String accName = "";
		String gender = "";
		String accPwd = "";
		System.out.println("계정 가입");
		System.out.print("이름을 입력해주세요 : ");
		accName = sc.next();
		System.out.print("성별을 입력해주세요 : ");
		gender = sc.next();
		System.out.print("비밀번호 4자리를 입력해주세요 : ");
		accPwd = sc.next();

		Account account = new Account(accName, gender, accPwd);

		return account;
	}

	private static int info() {
		System.out.println("		행복은행에 오신 것을 환영합니다.");
		System.out.println("	===================================");
		System.out.println("	1. 고객등록 2. 고객정보 확인 3. 내계좌 확인");
		System.out.println("	5. 종료");
		System.out.println("	===================================");
		System.out.print("	선택 번호 : ");
		return sc.nextInt();
	}

	private static int userInfo() {
		System.out.println("		행복은행에 오신 것을 환영합니다.");
		System.out.println("	===================================");
		System.out.println("	1. 계좌개설 2. 입금하기 3. 출금하기 4.계좌내역");
		System.out.println("	5. 로그아웃");
		System.out.println("	===================================");
		System.out.print("	선택 번호 : ");
		return sc.nextInt();
	}

}
