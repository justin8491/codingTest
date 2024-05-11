package kr.co.check3;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RoomTest14 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		 배열 및 메소드를 이용해서 작성
//		 - 초기화 메소드
//		 - 메뉴 메소드
//		 - 방예약 메소드
//		 - 방수정(취소) 메소드
//		 - 방 보기 메소드
//		 
//		 scan.nextLint() 메소드 사용
//		 
//		 /* 설계  ->  소스작성  -> 디버그
//		 키보드에 의한 입력작성 
//		 방12개가 있고     => 변수? 배열?  => 배열 room[12] 
//		 입력구성에서     // menu변수 : 1,2,3,99를 입력받음
//		 1을 누른경우 는 방의 예약,      // room[방번호]의 값이 1이면 예약상태
//		      1-> 호실번호 선택(1~12) -> 예약상태여부 확인
//		      -> 예약가능상태 -> 예약실시 -> 호실확인 => 메뉴로 복귀   
//		      -> 예약불가상태 -> 호실번호 선택(1~12) or 메뉴로 복귀
//		 2를 누른 경우 예약취소(예약->공실), // room[방번호]의 값이 0이면 공실
//		       2-> 호실번호선택(1~12) -> 취소가능여부
//		      -> 취소가능 : 해당호실의 값을 0으로 => 메뉴복귀 
//		      -> 취소불가 : 예약되지않은 방이라고 표시. => 메뉴복귀
//		 3를 누른 경우는 호실 확인,   // 1인 경우는 "예약됨:★ " 0인경우는 "예약가능☆"
//		 99 를 누른 경우는 프로그램종료. 

//		=> 추가사항 : 
//		1. 객실규모(크기)는 시작과 동시에 입력(이 호텔에 객실이 몇개 있는지)
//      2. 호텔방번호/호텔방명(ex-로얄/참나무 등)/객실인원/가격
//      3. 예약 시 예약자명/예약번호(취소시 필요)/전화번호 등
//      4. 기타 필요한 기능(관리자모드)
//		=> 추가사항 시나리오
//		1. 객실 수를 입력
//		2. 객실 수 만큼 객체를 맵에 담는다.
//		3. 담은 맵을 메서드에 적용한다.

		// 선언부
		int roomNum = 0; // 방 번호
		int menuNum = 0; // 메뉴 번호

		// new 선언 >>
		String roomName = ""; // 방 이름
		int numOfRoom = 0; // 객실 인원
		int price = 0; // 가격

		// 객실 수 >>
		int roomCount = 0;
		System.out.print("객실 크기를 입력해주세요 : ");
		roomCount = sc.nextInt();

//		List<String> roomList = new ArrayList<String>();
//		Map<String, Object> roomList = new HashMap<String, Object>();

		ArrayList<Object> roomList = new ArrayList<Object>();
		// 아래와 같이 생성시 roomNum 은 roomList
		for (int i = 0; i < roomCount; i++) {

			// 객실 인원 수 배치
			if (i % 3 == 0) { // 3의 배수 방번호 일 때
				numOfRoom = 3;
			} else if (i % 2 == 0) {
				numOfRoom = 2;
			}
			int tempToPrice = i % 10; // i 값 1의 자리만 빼기 0일때의 값 따로 처리
			// 가격
			if (tempToPrice != 0) {
				price += 10000;
			} else {
				price = 100000;
			}

//			객체 생성

//			생성 객체 맵에 담기

			// 층수
			int tempToF = i % 10;
			String tempToFS = "1";
			if (tempToF == 0 && i != 0) {
				// i 값이 1~9 사이가 아닐때
				tempToFS = (Integer.parseInt(tempToFS) + 1) + "";
				tempToFS = tempToFS + "0" + tempToF;
			} else if (tempToF != 0 || i == 0) {
				// i 값이 1~9 사이 일 때
				tempToFS = tempToFS + "0" + tempToF;
			}
			Room hostell = new Room(Integer.parseInt(tempToFS), "스탠다드" + i, numOfRoom, price);
			roomList.add(hostell);

		}

		System.out.println(Arrays.deepToString(roomList.toArray()));

		int[] room = new int[roomCount];

		String[] roomPwd = new String[roomCount];

		// CheckIn Password ?:?:?:?
//		String userPwd = "";

		while (true) {

			inforMsg();

			menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				roomCheckIn(room, roomPwd, roomNum);
				break;
			case 2:
				roomCheckOut(room, roomPwd);
				break;
			case 3:
				roomSearuch(room);
				break;
			case 99:

				break;

			default:
				break;
			}

		}

	}

	/**
	 * 방 예약 취소
	 * 
	 * @param room
	 * @param roomPwd
	 */
	private static void roomCheckOut(int[] room, String[] roomPwd) {

		System.out.print("예약 취소 할 방 번호를 눌러주세요 : ");
		int roomNum = sc.nextInt();

		for (int i = 0; i < room.length; i++) {
			if (i == roomNum) {
				if (room[i - 1] == 1) { // 예약인지 확인
					System.out.print("예약 비밀번호를 눌러주세요 : ");
					String pwd = sc.next();
					if (pwdValueOf(roomPwd, pwd)) { // 번호가 맞으면
						room[i - 1] = 0;
						roomPwd[i - 1] = "";
						System.out.println("예약 취소가 완료되었습니다.");
					} else {
						System.out.println("비밀번호가 틀립니다 다시 확인해 주세요.");
					}

				} else {
					System.out.println("예약 하지 않은 방번호입니다.");
				}
			}
		}
	}

	/**
	 * 방 예약
	 * 
	 * @param room
	 * @param roomPwd
	 * @param roomNum
	 */
	private static void roomCheckIn(int[] room, String[] roomPwd, int roomNum) {

		System.out.print("방 번호를 입력해주세요 : ");
		roomNum = sc.nextInt();
		if (valueOf(roomNum, room)) {
			System.out.println("예약 가능합니다. ");
			System.out.println("방을 예약합니다. ");
			roomCISave(room, roomPwd, roomNum);
		} else {
			System.out.println("예약된 방 번호 입니다. 예약 불가능 합니다.");
		}
	}

	/**
	 * 방 예약 및 비밀번호 저장
	 */
	private static void roomCISave(int[] room, String[] roomPwd, int roomNum) {
		// 방 비밀번호 저장
		System.out.print("방 예약 비밀번호를 입력해 주세요. (4자리) : ");
		for (int i = 0; i < roomPwd.length; i++) {
			if (roomNum == i) {
				roomPwd[i - 1] = sc.next();
				room[i - 1] = 1;
			} else {
				continue;
			}
			System.out.print(i + "번 방 비밀번호" + roomPwd[i - 1]);
		}
	}

	/**
	 * 안내 문구
	 */
	private static void inforMsg() {
		System.out.println("\n" + "  __    __     ______    ________  ___________  _______  ___      ___       \n"
				+ " /\" |  | \"\\   /    \" \\  /\"       )(\"     _   \")/\"     \"||\"  |    |\"  |      \n"
				+ "(:  (__)  :) // ____  \\(:   \\___/  )__/  \\\\__/(: ______)||  |    ||  |      \n"
				+ " \\/      \\/ /  /    ) :)\\___  \\       \\\\_ /    \\/    |  |:  |    |:  |      \n"
				+ " //  __  \\\\(: (____/ //  __/  \\\\      |.  |    // ___)_  \\  |___  \\  |___   \n"
				+ "(:  (  )  :)\\        /  /\" \\   :)     \\:  |   (:      \"|( \\_|:  \\( \\_|:  \\  \n"
				+ " \\__|  |__/  \\\"_____/  (_______/       \\__|    \\_______) \\_______)\\_______) \n"
				+ "                                                                            \n" + "");

		System.out.println("1.방 예약.");
		System.out.println("2.예약 취소.");
		System.out.println("3.호실 확인.");
		System.out.println("99.종료");
		System.out.print("메뉴 선택 : ");
	}

	/**
	 * 방 호실 확인
	 * 
	 * @param room
	 */
	private static void roomSearuch(int[] room) {
		for (int i = 0; i < room.length; i++) {
			if (room[i] == 1) {
				if (i % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + (i + 1) + "]" + "번방 예약 불가 :");
			} else {
				if (i % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + (i + 1) + "]" + "번방 예약 가능 : ");
			}

		}
	}

	/**
	 * 존재 값 비교
	 * 
	 * @param roomNum
	 * @param room
	 * @return
	 */
	private static boolean valueOf(int roomNum, int[] room) {
		for (int i = 0; i < room.length; i++) {
			if (i == roomNum) {
				if (room[i - 1] == 0) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	/**
	 * 비밀번호가 맞으면 true : 비밀번호가 틀리면 false
	 * 
	 * @param roomPwd
	 * @param pwd
	 * @return
	 */
	private static boolean pwdValueOf(String[] roomPwd, String pwd) {
		for (int i = 0; i < roomPwd.length; i++) {
			if (pwd.equals(roomPwd[i])) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

}
