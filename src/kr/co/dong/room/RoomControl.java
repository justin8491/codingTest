/*
 * 호텔 예약 프로그램 구현하기 ver1.0
 * - 호텔방 : 호수, 방이름,  가격, 설명, 예약유무(상태), 예약자명, 예약코드
 * - 방예약 : 예약자명, 예약코드, 호수
 * - 기능 : 예약하기, 예약취소하기, 호텔룸 확인하기, 메뉴보여주기, 흐름보여주기
 *  
 */

package kr.co.dong.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomControl {
	static Scanner sc = new Scanner(System.in);
	static Room saveRoom = null;

	public static void main(String[] args) {
//		호텔룸(5개)의 정보를 보관 -> List		
//		
		List<Room> list = new ArrayList<Room>();
		boolean stop = false;

//		호텔의 룸 정보를 초기화하고 저장
		init(list);
//		startInfo();
		while (!stop) {
			int sel = menu();

			switch (sel) {
			case 1: // 방 예약하기
				revRoom(list);
				break;
			case 2: // 방 예약 취소
				canselRoom(list);
				break;
			case 3: // 방 전체확인/ 선택확인
				printRoom(list);
				break;
			case 4: // 예약자 정보확인
				customer(list);
				break;
			default:

			}

		}

	}

	private static void customer(List<Room> list) {
		System.out.print("예약한 방 번호를 입력해주세요 : ");
		int rNo = sc.nextInt();
		for (Room r : list) {
			if (r.getrNo() == rNo && r.isCheck() == true) {
				System.out.println("예약자 : " + r.getCustomer());
				System.out.println("예약 번호 : " + r.getRevCode());
			} else if (r.getrNo() == rNo && r.isCheck() == false) {
				System.out.println("예약 되지않은 방 입니다. 다시 시도해주세요.");
			}
		}
	}

	private static int menu() {
		System.out.println("=======================================================");
		System.out.println("1. 예약하기 2. 예약 취소 3. 예약조회 전체/선택 4. 예약자 정보확인");
		System.out.println("=======================================================");
		return sc.nextInt();
	}

//	list내에 해당 내용이 저장되어 있는 index를 찾는 메소드
//	방번호로 찾기? 방이름으로 찾기
	private static int findRoom(int rNo, List<Room> list) {
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
//			list.get(i).getrName() => 리스트내에 방이름
			if (rNo == list.get(i).getrNo()) {
				index = i;
				break;
//				return index;
			}
		}
		return index;
	}

	private static void canselRoom(List<Room> list) {
		System.out.print("예약 하신 방 번호를 입력 해주세요 : ");
		int rNo = sc.nextInt();
		System.out.print("예약자 성함을 입력 해주세요 : ");
		String rCustomer = sc.next();
		for (Room r : list) {
			if (r.getrNo() == rNo && r.getCustomer().equals(rCustomer)) {
				r.setRevCode(null);
				r.setCustomer(null);
				r.setCheck(false);
				System.out.println(r.getrNo() + "번방 예약 취소되었습니다.");
			}
		}

	}

	public static void printRoomNo(List<Room> list) {
		int f = 0; // 층수 처리
		for (Room r : list) {
			System.out.print("[" + r.getrNo() + "]" + "방 : ");
			f++;
			if (f % 5 == 0) {
				System.out.println();
			}
		}
	}

	private static void revRoom(List<Room> list) {
		printRoomNo(list);
		System.out.print("예약 할 방 번호를 입력 하세요 : ");
		int rNo = sc.nextInt();
		System.out.print("예약자 성함을 적어주세요 : ");
		String customer = sc.next();
		for (Room r : list) {
			if (r.getrNo() == rNo && r.getRevCode() == null && r.getCustomer() == null) {
				r.setCheck(true);
				r.setRevCode(createRevCode());
				r.setCustomer(customer);
				System.out.println("예약 완료 되었습니다.");

			}
		}

	}

	private static String createRevCode() {
		String code = "";
		while (code.length() != 4) {
			code += (int) (Math.random() * 9 + 1) + "";
		}

		return code;
	}

	private static void printRoom(List<Room> list) {
		System.out.println("1.전체호실확인 2.선택호실확인");
		int sel = sc.nextInt();
		if (sel == 1) {
			for (Room r : list) {
				System.out.println(r);
			}
		} else if (sel == 2) {
			System.out.print("방 호실을 입력 해 주세요 : ");
			int rNo = sc.nextInt();
			System.out.println(list.get(findRoom(rNo, list)).isCheck() == false ? rNo + " 예약 가능" : rNo + " 예약 불가능");
		}
	}

	private static void init(List<Room> list) {
		Room r1 = new Room(5323, "소나무", 20000, "사는 방");
		Room r2 = new Room(13232, "참나무", 20000, "사는 방");
		Room r3 = new Room(3123, "동백나무", 20000, "사는 방");
		Room r4 = new Room(3213, "벚나무", 20000, "사는 방");
		Room r5 = new Room(412, "은행나무", 20000, "사는 방");

//		방 저장
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(r5);
	}

}
