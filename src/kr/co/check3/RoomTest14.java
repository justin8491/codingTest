package kr.co.check3;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomTest14 {

	static Scanner sc = new Scanner(System.in);

	// 기타 변수
	static int temp = 0;
	static String strTemp = "";
	static Room tempRoom;

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
//		2. 객실 수 만큼 객체를 리스트에 담는다.
//		3. 담은 리스트를 메서드에 적용한다.

		// 선언부
		int roomNum = 0; // 방 번호
		int menuNum = 0; // 메뉴 번호
		boolean stop = false;
		// String[] roomPwd = new String[roomCount];

		// new 선언 >>
		String roomName = ""; // 방 이름
		int numOfRoom = 0; // 객실 인원
		int price = 0; // 가격
		boolean reserVation = true; // 예약 true/false 값
		String roomPwd = "0000"; // 방 비밀번호

		int tempToF = 0; // 층수 뒷자리 표기 값 예) ??0
		int firstF = 1; // 층수 앞자리 표기 값 예) 0??
		String tempToFS = ""; // 층수 합산 값 예) 000

		// 객실 수
		int roomCount = 0;
		ArrayList<Object> roomList = new ArrayList<Object>();

//		<----------- Update Wish List ----------->
//		1. 관리자
//		2. 방생성 메소드

		// <--------- Start --------->x
		roomCount = roomCountMethod(roomCount);

		// 해당 처리 메소드로 만들 것
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

			// 층수
			tempToF = i % 10;
			if (tempToF == 0 && i != 0) {
				// i 값이 1~9 사이가 아닐때
				firstF++;
				tempToFS = (Integer.parseInt(tempToFS) + 1) + "";
				tempToFS = firstF + "0" + tempToF;
			} else if (tempToF != 0 || i == 0) {
				// i 값이 1~9 사이 일 때
				tempToFS = firstF + "0" + tempToF;
			}
			Room room = new Room(Integer.parseInt(tempToFS), "스탠다드" + i, numOfRoom, reserVation, price, roomPwd);
			roomList.add(room);
		}

		while (!stop) {
			menuNum = inforMsg();
			switch (menuNum) {
			case 1:
//				roomCheckIn(room, roomPwd, roomNum);
				roomCheckIn(roomList, roomNum); // New Ver.
				break;
			case 2:
				// roomCheckOut(room, roomPwd);
				roomCheckOut(roomList, roomNum); // New Ver.
				break;
			case 3:
//				roomSearuch(room);
				roomSearuch(roomList); // New Ver.
				break;
			case 99:
				stop = true;
				System.out.println("예약 시스템 종료");
				break;
			}

		}

	}

//	private static ArrayList<Object> roomCntToCreate(String roomPwd, boolean reserVation, int roomCount, int numOfRoom,
//			int price, int tempToF, int firstF, String tempToFS, ArrayList<Object> roomList) {
//		// 아래와 같이 생성시 roomNum 은 roomList
//		for (int i = 0; i < roomCount; i++) {
//
//			// 객실 인원 수 배치
//			if (i % 3 == 0) { // 3의 배수 방번호 일 때
//				numOfRoom = 3;
//			} else if (i % 2 == 0) {
//				numOfRoom = 2;
//			}
//			int tempToPrice = i % 10; // i 값 1의 자리만 빼기 0일때의 값 따로 처리
//			// 가격
//			if (tempToPrice != 0) {
//				price += 10000;
//			} else {
//				price = 100000;
//			}
//
//			// 층수
//			tempToF = i % 10;
//			if (tempToF == 0 && i != 0) {
//				// i 값이 1~9 사이가 아닐때
//				firstF++;
//				tempToFS = (Integer.parseInt(tempToFS) + 1) + "";
//				tempToFS = firstF + "0" + tempToF;
//			} else if (tempToF != 0 || i == 0) {
//				// i 값이 1~9 사이 일 때
//				tempToFS = firstF + "0" + tempToF;
//			}
//			Room room = new Room(Integer.parseInt(tempToFS), "스탠다드" + i, numOfRoom, reserVation, price, roomPwd);
//			roomList.add(room);
//		}
//		return roomList;
//
//	}

	private static int roomCountMethod(int roomCount) {
		System.out.print("객실 크기를 입력해주세요 : ");
		return sc.nextInt();
	}

	/**
	 * 방 예약 취소
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
	 * New 방 예약 취소
	 */
	private static void roomCheckOut(ArrayList<Object> roomList, int roomNum) {
		System.out.print("예약 취소 할 방 번호를 눌러주세요 : ");
		roomNum = sc.nextInt();

		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor;
			if (tempRoom.isReserVation() == false) {
				if (roomNum == tempRoom.getRoomNum()) {
					System.out.print("예약 비밀번호를 눌러주세요 : ");
					strTemp = sc.next();
					if (pwdValueOf(tempRoom.getRoomPwd(), strTemp)) { // 예약 비밀번호 맞으면
						tempRoom.setReserVation(true);
						tempRoom.setRoomPwd("0000");
						System.out.println("예약 취소 완료");
					} else {
						System.out.println("비밀번호 실패 예약 취소를 다시 진행해 주세요.");
					}
				} else {
					System.out.println("예약 하지 않은 방번호입니다.");
				}
			} else {
				continue;
			}
		}
	}

	/**
	 * 방 예약
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
	 * New 방 예약
	 */
	private static void roomCheckIn(ArrayList<Object> roomList, int roomNum) {

		System.out.print("방 번호를 입력해주세요 : ");
		roomNum = sc.nextInt();
		if (valueOf(roomList, roomNum)) { // 예약 가능 시
			roomCISave(roomList, roomNum);
		} else {
			System.out.println("예약 불가능한 호실 입니다.");
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
	 * New 방 예약 및 비밀번호 저장
	 */
	private static void roomCISave(ArrayList<Object> roomList, int roomNum) {
		// 방 비밀번호 저장
		System.out.print("방 예약 비밀번호를 입력해 주세요. (4자리) : ");
		strTemp = sc.next();
		Room tempRoom = new Room();
		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor; // 임시 템프 객체에 룸리스트에서 빼온 객체를 담는다
			if (tempRoom.getRoomNum() == roomNum && tempRoom.isReserVation() == true) { // 입력한 roomNum 값과 같은 tempRoom
																						// 객체여야 하고 그객체가 예약도 가능한 상태라면
				tempRoom.setRoomPwd(strTemp); // 작성한 비밀번호 add
				tempRoom.setReserVation(false); // 예약 불가 상태 ON
				System.out.println(tempRoom.getRoomNum() + "번 방 예약 완료");
				System.out.println("처음 화면으로 돌아갑니다..");
			} else {
				continue;
			}
		}
	}

	/**
	 * 안내 문구
	 */
	private static int inforMsg() {
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

		return sc.nextInt();
	}

	/**
	 * 방 호실 확인
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
	 * New 방 호실 확인
	 */
	private static void roomSearuch(ArrayList<Object> roomList) {
		Room tempRoom = new Room();
		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor; // 임시 템프 객체에 룸리스트에서 빼온 객체를 담는다

			if (tempRoom.isReserVation()) {
				if (tempRoom.getRoomNum() % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + tempRoom.getRoomNum() + "]" + "번 가능 :");
			} else {
				if (tempRoom.getRoomNum() % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + tempRoom.getRoomNum() + "]" + "번방 불가능 : ");
			}
		}

	}

	/**
	 * 존재 값 비교
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
	 * New 존재 값 비교 ArrayList<Room> roomList
	 */
	private static boolean valueOf(ArrayList<Object> roomList, int roomNum) {
		Room tempRoom = new Room();
		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor;
			if (tempRoom.getRoomNum() == roomNum) {
				if (tempRoom.isReserVation()) {
					System.out.println("예약 가능합니다. 예약을 진행합니다.");
					return true;
				} else {
					System.out.println("이미 예약 된 호실입니다. ");
					System.out.println("처음으로 돌아갑니다.");
					return false;
				}
			} else if (tempRoom.getRoomNum() != roomNum) {
				continue;

			} else {
				System.out.println("존재하지 않은 호실입니다. 관리자에게 문의하세요.");
			}
		}
		return false;
	}

	/**
	 * 비밀번호가 맞으면 true : 비밀번호가 틀리면 false
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

	private static boolean pwdValueOf(String roomPwd, String pwd) {

		if (roomPwd.equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}

}
