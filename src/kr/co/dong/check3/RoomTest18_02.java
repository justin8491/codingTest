/* 배열 및 메소드를 이용해서 작성
 * - 초기화 메소드
 * - 메뉴 메소드
 * - 방예약 메소드
 * - 방수정(취소) 메소드
 * - 방 보기 메소드
 * 
 * scan.nextLint() 메소드 사용
 * 
 * /* 설계  ->  소스작성  -> 디버그
 * 키보드에 의한 입력작성 
 * 방12개가 있고     => 변수? 배열?  => 배열 room[12] 
 * 입력구성에서     // menu변수 : 1,2,3,99를 입력받음
 * 1을 누른경우 는 방의 예약,      // room[방번호]의 값이 1이면 예약상태
 *      1-> 호실번호 선택(1~12) -> 예약상태여부 확인
 *      -> 예약가능상태 -> 예약실시 -> 호실확인 => 메뉴로 복귀   
 *      -> 예약불가상태 -> 호실번호 선택(1~12) or 메뉴로 복귀
 * 2를 누른 경우 예약취소(예약->공실), // room[방번호]의 값이 0이면 공실
 *       2-> 호실번호선택(1~12) -> 취소가능여부
 *      -> 취소가능 : 해당호실의 값을 0으로 => 메뉴복귀 
 *      -> 취소불가 : 예약되지않은 방이라고 표시. => 메뉴복귀
 * 3를 누른 경우는 호실 확인,   // 1인 경우는 "예약됨:★ " 0인경우는 "예약가능☆"
 * 99 를 누른 경우는 프로그램종료. 
 */
//=> 추가사항 : 1. 객실규모(크기)는 시작과 동시에 입력(이 호텔에 객실이 몇개 있는지)
//            2. 호텔방번호/호텔방명(ex-로얄/참나무 등)/객실인원/가격
//            3. 예약 시 예약자명/예약번호(취소시 필요)/전화번호 등
//            4. 기타 필요한 기능(관리자모드)
package kr.co.dong.check3;

import java.util.Scanner;

public class RoomTest18_02 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] room = new int[13];
		String[] roomName = { "", "Vip", "스위트룸", "스위트룸2", "스위트룸3", "온돌방", "이글루", "로얄", "로얄2", "로얄3", "뚱이방", "짱구방",
				"징징이방", "흰둥이방" };
		int[] roomPrice = { 0, 200000, 120000, 120000, 100000, 80000, 75000, 150000, 130000, 130000, 300000, 320000,
				250000, 200000 };
		int[] roomPp = { 0, 1, 2, 2, 2, 4, 4, 2, 2, 2, 4, 6, 4, 2 }; // 객실 인원

		int[] reserNum = new int[13];

		// new Create
		int hotellInfo = 5;
		String[][] hotellService = new String[5][room.length];

		for (int i = 0; i < hotellInfo; i++) {
			for (int j = 0; j < room.length; j++) {
				if (i == 0) {
					// 룸 예약 값 room
					hotellService[i][j] = room[j] + ""; // int
				} else if (i == 1) {
					// 룸 이름 roomName
					hotellService[i][j] = roomName[j];
				} else if (i == 2) {
					hotellService[i][j] = roomPrice[j] + ""; // int
				} else if (i == 3) {
					hotellService[i][j] = roomPp[j] + ""; // int
				} else if (i == 4) {
					hotellService[i][j] = reserNum[j] + ""; // int
				}
			}
		}

		int sel = 0;
//		* - 초기화 메소드		
		init(room);

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

				break;

			case 2:
//				2번 선택시 예약 취소
//				 * - 방수정(취소) 메소드

				cancel(room, reserNum);
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
	private static void roomList(String[][] hotellService) {
		for (int i = 1; i < hotellService.length; i++) {

			if (hotellService[0][i] == "1") {
				System.out.println(i + "호실은 이미 예약된 방입니다..");
			} else {
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
//		int num = -1;
//
//		int tmp = scan.nextInt();
//
//		for (int i = 1; i < reserNum.length; i++) {
//			if (reserNum[i] == tmp) {
//				num = i;
//			}
//		}

//		return room;
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
