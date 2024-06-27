package kr.co.dong.user;

import java.sql.Timestamp;
import java.util.Date;

public class UserController {

	public static void main(String[] args) {
		Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Current Timestamp: " + currentTimestamp);

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Date date = new Date(timestamp.getTime());
		System.out.println("Date: " + date);
	}

}
