package kr.co.dong.check3;

import java.util.Scanner;

public class RoomTest14_2Array {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("객실 수를 입력해주세요 :");
		int roomCount = scan.nextInt();
//		String[] room = new String[roomCount];
		String[] roomName = { "Vip", "스위트룸", "스위트룸2", "온돌방", "이글루", "로얄", "로얄2", "로얄3", "뚱이방", "짱구방", "징징이방", "흰둥이방" };
		int[] roomPrice = { 120000, 120000, 100000, 80000, 75000, 150000, 130000, 130000, 300000, 320000, 250000,
				200000 };
		int[] roomPp = { 2, 2, 2, 4, 4, 2, 2, 2, 4, 6, 4, 2 }; // 객실 인원

//		int[] reserNum = new int[roomCount];

		// new Create
		int hotellInfo = 5;
		// [0] room : [1] roomName [2] roomPrice [3] roomPp [4] reserNum
		Object[][] hotellService = new Object[5][roomCount];

		for (int i = 0; i <= hotellInfo; i++) {
			for (int j = 0; j < roomCount; j++) {
				if (i == 0) {
					// 룸 예약 값 room
					hotellService[i][j] = "0"; // int
				} else if (i == 1) {
					// 룸 이름 roomName
					hotellService[i][j] = "스위트룸" + i;
				} else if (i == 2) {
					hotellService[i][j] = "100000"; // int
				} else if (i == 3) {
					hotellService[i][j] = "2"; // int
				} else if (i == 4) {
					hotellService[i][j] = "0000"; // int
				}
			}
		}
		int sel = 0;
//		* - 초기화 메소드		
//		init(room);

		while (true) {
//			1.메뉴창 띄우기
//				 * - 메뉴 메소드
			menu();

//			2.번호를 콘솔로 받고 스위치문으로 넘어가기
//			 * scan.nextLint() 메소드 사용
			sel = scan.nextInt();

			if (sel == 99) { // 99번 종료
				System.out.println("종료");
				break;
			}

			switch (sel) {
			case 1:
//				1번 선택시 방 예약  /room[방번호 값] 1이면 예약불가 0이면 공실상태
//				 * - 방예약 메소드 사용
//				reserNum = reserNum;
//				reservation(room, reserNum, hotellService);
				reservation(hotellService, roomCount);

				break;

			case 2:
//				2번 선택시 예약 취소
//				 * - 방수정(취소) 메소드

//				cancel(room, reserNum);
				cancel(hotellService, roomCount);
				break;

			case 3:
//				3번 선택시 방 호실 확인
//				 * - 방 보기 메소드
				roomList(hotellService);
				break;

			case 4:
				roomData(roomName, roomPrice, roomPp);
			}
		}

	}

	/**
	 * 객실 정보
	 * 
	 * @param roomName
	 * @param roomPrice
	 * @param roomPp
	 */
	private static void roomData(String[] roomName, int[] roomPrice, int[] roomPp) {
		for (int i = 1; i < roomName.length; i++) {
			if (i >= 109) {
				i = i + 92;
			}
//			for(int j=1;j<roomName.length;j++) {
			System.out.println(i + 100 + "호실 객실 이름 :" + roomName[i] + "   가격 :" + roomPrice[i] + "원" + "   객실인원 "
					+ roomPp[i] + "명");

//			}
		}
	}

//	 * - 방 보기 메소드
	private static void roomList(Object[][] hotellService) {
		for (int i = 1; i < hotellService[0].length; i++) {
//			System.out.println(hotellService[0][i]);
			if (hotellService[0][i] == "1") {
				System.out.println(i + "호실은 이미 예약된 방입니다..");
			} else if (hotellService[0][i] == "0") {
				System.out.println(i + "호실은 예약이 가능합니다..!!!");
			}
		}

	}

//	 * - 방수정(취소) 메소드
	private static void cancel(int[] room, int[] reserNum) {

		System.out.println("취소하실 방 번호를 선택해주세요");
		int roomNum = scan.nextInt();

		for (int i = 1; i < room.length; i++) {
			if (i == roomNum) {
				if (room[i] == 1) {
					System.out.println("예약번호를 입력해주세요.");
					int tmp = scan.nextInt();
					if (reserNum[i] == tmp) { // 비밀번호가 같아

						System.out.println("취소되었습니다.");
						room[i] = 0;
						break;
					} else {
						System.out.println("예약번호가 다릅니다.");// 비밀번호가 달라
						continue;
					}
				}

			}
		}

	}

	private static void cancel(Object[][] hotellService, int roomCount) {
		// [0] room : [1] roomName [2] roomPrice [3] roomPp [4] reserNum
		System.out.println("취소하실 방 번호를 선택해주세요");
		int roomNum = scan.nextInt();

		if (hotellService[0][roomNum] == "1") {
			System.out.println("예약번호를 입력해주세요.");
			String tmp = scan.next();
			if (hotellService[4][roomNum].equals(tmp)) { // 비밀번호가 같아

				System.out.println("취소되었습니다.");
				hotellService[0][roomNum] = "0";
			} else {
				System.out.println("예약번호가 다릅니다.");// 비밀번호가 달라
			}
		}

	}

//	 * - 초기화 메소드
	private static void init(int[] room) {
		for (int i = 0; i < room.length; i++) {
			room[i] = (int) (Math.random() * 2);
		}
//		return room;
	}

//	 * - 방예약 메소드 
	private static void reservation(int[] room, int[] reserNum, String[][] hotelService) {

		System.out.println("-----예약하실 방 번호를 입력해주세요-----");
		int sel = scan.nextInt();

		for (int i = 1; i < room.length; i++) {
			if (room[sel] == 1) {
				System.out.println("이미 예약된 방입니다. 다른 방을 선택해주세요.");

				break;
			}

			if (room[sel] == 0) {
				System.out.println("예약번호를 입력해주세요.");
				reserNum[sel] = scan.nextInt();
				System.out.println(sel + "호실을 예약하셨습니다.");

				room[sel] = 1;
				break;

			}
		}
	}

	private static void reservation(Object[][] hotelService, int roomCount) {
		// [0] room : [1] roomName [2] roomPrice [3] roomPp [4] reserNum
		System.out.println("-----예약하실 방 번호를 입력해주세요-----");
		int sel = scan.nextInt();

		if (hotelService[0][sel] == "1") {
			System.out.println("이미 예약된 방입니다. 다른 방을 선택해주세요.");
		}

		if (hotelService[0][sel] == "0") {
			System.out.println("예약번호를 입력해주세요.");
			String tempToS = scan.next();
			hotelService[4][sel] = tempToS;
			System.out.println(sel + "호실을 예약하셨습니다.");
			hotelService[0][sel] = "1";
		}

	}

//	* - 메뉴 메소드
	private static void menu() {
		System.out.println("========메뉴===============");
		System.out.println("1번 방 예약       객실방 총:12");
		System.out.println("2번 예약 취소");
		System.out.println("3번 호실 확인");
		System.out.println("4번 객실 정보");
		System.out.println("99번 종료");
		System.out.println("==========================");
	}
}
