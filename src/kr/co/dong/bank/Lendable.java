package kr.co.dong.bank;

public interface Lendable {

	void checkOut(String borrower, String date);

	void checkIn();

}
