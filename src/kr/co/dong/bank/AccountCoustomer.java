package kr.co.dong.bank;

public interface AccountCoustomer {
	/**
	 * 입금하기
	 * 
	 * @param account
	 * @param money
	 * @return
	 */
	int deposit(int amount);

	/**
	 * 출금하기
	 * 
	 * @param account
	 * @param money
	 * @return
	 * @throws Exception
	 */
	int withdraw(int amount) throws Exception;

	/**
	 * 계좌내역
	 * 
	 * @param account
	 * @return
	 */
	AccountCoustomer tranSTHistory(AccountCoustomer account);

	boolean checkAccount(Account account, Bank bank);
}
