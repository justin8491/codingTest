package kr.co.dong.bank;

import java.util.Scanner;

public interface AccountCoustomer {

//	int deposit(int amount);

	/**
	 * 계좌내역
	 * 
	 * @param account
	 * @return
	 */
//	AccountCoustomer tranSTHistory(AccountCoustomer account);
	/**
	 * 계정 정보 확인
	 * 
	 * @param account
	 * @param bank
	 */
	void checkAccount(Account account, Bank bank);

	/**
	 * 입금하기
	 * 
	 * @param account
	 * @param money
	 * @return
	 */
	Bank deposit(Bank bank, int money, Scanner sc);

	/**
	 * 출금하기
	 * 
	 * @param account
	 * @param money
	 * @return
	 * @throws Exception
	 */
	Bank withdraw(Bank bank, int money, Scanner sc) throws Exception;

}
