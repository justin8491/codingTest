package kr.co.dong.check3;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomTest14 {

	static Scanner sc = new Scanner(System.in);

	// ��Ÿ ����
	static int temp = 0;
	static String strTemp = "";
	static Room tempRoom;

	public static void main(String[] args) {
//		 �迭 �� �޼ҵ带 �̿��ؼ� �ۼ�
//		 - �ʱ�ȭ �޼ҵ�
//		 - �޴� �޼ҵ�
//		 - �濹�� �޼ҵ�
//		 - �����(���) �޼ҵ�
//		 - �� ���� �޼ҵ�
//		 
//		 scan.nextLint() �޼ҵ� ���
//		 
//		 /* ����  ->  �ҽ��ۼ�  -> �����
//		 Ű���忡 ���� �Է��ۼ� 
//		 ��12���� �ְ�     => ����? �迭?  => �迭 room[12] 
//		 �Է±�������     // menu���� : 1,2,3,99�� �Է¹���
//		 1�� ������� �� ���� ����,      // room[���ȣ]�� ���� 1�̸� �������
//		      1-> ȣ�ǹ�ȣ ����(1~12) -> ������¿��� Ȯ��
//		      -> ���డ�ɻ��� -> ����ǽ� -> ȣ��Ȯ�� => �޴��� ����   
//		      -> ����Ұ����� -> ȣ�ǹ�ȣ ����(1~12) or �޴��� ����
//		 2�� ���� ��� �������(����->����), // room[���ȣ]�� ���� 0�̸� ����
//		       2-> ȣ�ǹ�ȣ����(1~12) -> ��Ұ��ɿ���
//		      -> ��Ұ��� : �ش�ȣ���� ���� 0���� => �޴����� 
//		      -> ��ҺҰ� : ����������� ���̶�� ǥ��. => �޴�����
//		 3�� ���� ���� ȣ�� Ȯ��,   // 1�� ���� "�����:�� " 0�ΰ��� "���డ�ɡ�"
//		 99 �� ���� ���� ���α׷�����. 

//		=> �߰����� : 
//		1. ���ǱԸ�(ũ��)�� ���۰� ���ÿ� �Է�(�� ȣ�ڿ� ������ � �ִ���)
//      2. ȣ�ڹ��ȣ/ȣ�ڹ��(ex-�ξ�/������ ��)/�����ο�/����
//      3. ���� �� �����ڸ�/�����ȣ(��ҽ� �ʿ�)/��ȭ��ȣ ��
//      4. ��Ÿ �ʿ��� ���(�����ڸ��)

//		=> �߰����� �ó�����
//		1. ���� ���� �Է�
//		2. ���� �� ��ŭ ��ü�� ����Ʈ�� ��´�.
//		3. ���� ����Ʈ�� �޼��忡 �����Ѵ�.

		// �����
		int roomNum = 0; // �� ��ȣ
		int menuNum = 0; // �޴� ��ȣ
		boolean stop = false; // ����ý��� ���� ��
		// String[] roomPwd = new String[roomCount];

		// new ���� >>
		String roomName = ""; // �� �̸�
		int numOfRoom = 0; // ���� �ο�
		int price = 0; // ����
		boolean reserVation = true; // ���� true/false ��
		String roomPwd = "0000"; // �� ��й�ȣ

		int tempToF = 0; // ���� ���ڸ� ǥ�� �� ��) ??0
		int firstF = 1; // ���� ���ڸ� ǥ�� �� ��) 0??
		String tempToFS = ""; // ���� �ջ� �� ��) 000

		// ���� ��
		int roomCount = 0;
		ArrayList<Object> roomList = new ArrayList<Object>();
		Room room = new Room();
//		<----------- Update Wish List ----------->
//		1. ������
//		2. �� ���� ���� �޼���� ���� �� ���� �� �� (�Ϸ�)

		// <--------- Start --------->
		roomCount = roomCountMethod(roomCount);

		// �ش� ó�� �޼ҵ�� ���� ��
		;
		roomList = roomCreat(roomCount, numOfRoom, price, tempToF, firstF, tempToFS, room, reserVation, roomPwd,
				roomList);

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
			case 1004:
				adminMod();
				break;
			case 99:
				stop = true;
				System.out.println("���� �ý��� ����");
				break;
			}

		}
		// <--------- End --------->
	}

	private static ArrayList<Object> roomCreat(int roomCount, int numOfRoom, int price, int tempToF, int firstF,
			String tempToFS, Room room, boolean reserVation, String roomPwd, ArrayList<Object> roomList) {
		for (int i = 0; i < roomCount; i++) {

			// ���� �ο� �� ��ġ
			if (i % 3 == 0) { // 3�� ��� ���ȣ �� ��
				numOfRoom = 3;
			} else if (i % 2 == 0) {
				numOfRoom = 2;
			}
			int tempToPrice = i % 10; // i �� 1�� �ڸ��� ���� 0�϶��� �� ���� ó��
			// ����
			if (tempToPrice != 0) {
				price += 10000;
			} else {
				price = 100000;
			}

			// ����
			tempToF = i % 10;
			if (tempToF == 0 && i != 0) {
				// i ���� 1~9 ���̰� �ƴҶ�
				firstF++;
				tempToFS = (Integer.parseInt(tempToFS) + 1) + "";
				tempToFS = firstF + "0" + tempToF;
			} else if (tempToF != 0 || i == 0) {
				// i ���� 1~9 ���� �� ��
				tempToFS = firstF + "0" + tempToF;
			}

			room = new Room(Integer.parseInt(tempToFS), "���Ĵٵ�" + i, numOfRoom, reserVation, price, roomPwd);
			roomList.add(room);

		}
		return roomList;
	}
//	for (int i = 0; i < roomCount; i++) {
//
//		// ���� �ο� �� ��ġ
//		if (i % 3 == 0) { // 3�� ��� ���ȣ �� ��
//			numOfRoom = 3;
//		} else if (i % 2 == 0) {
//			numOfRoom = 2;
//		}
//		int tempToPrice = i % 10; // i �� 1�� �ڸ��� ���� 0�϶��� �� ���� ó��
//		// ����
//		if (tempToPrice != 0) {
//			price += 10000;
//		} else {
//			price = 100000;
//		}
//
//		// ����
//		tempToF = i % 10;
//		if (tempToF == 0 && i != 0) {
//			// i ���� 1~9 ���̰� �ƴҶ�
//			firstF++;
//			tempToFS = (Integer.parseInt(tempToFS) + 1) + "";
//			tempToFS = firstF + "0" + tempToF;
//		} else if (tempToF != 0 || i == 0) {
//			// i ���� 1~9 ���� �� ��
//			tempToFS = firstF + "0" + tempToF;
//		}
//
//		room = new Room(Integer.parseInt(tempToFS), "���Ĵٵ�" + i, numOfRoom, reserVation, price, roomPwd);
////		roomList.add(room);
//	}

	private static int roomCountMethod(int roomCount) {
		System.out.print("���� ũ�⸦ �Է����ּ��� : ");
		return sc.nextInt();
	}

	/**
	 * �� ���� ���
	 */
	private static void roomCheckOut(int[] room, String[] roomPwd) {
		System.out.print("���� ��� �� �� ��ȣ�� �����ּ��� : ");
		int roomNum = sc.nextInt();
		for (int i = 0; i < room.length; i++) {
			if (i == roomNum) {
				if (room[i - 1] == 1) { // �������� Ȯ��
					System.out.print("���� ��й�ȣ�� �����ּ��� : ");
					String pwd = sc.next();
					if (pwdValueOf(roomPwd, pwd)) { // ��ȣ�� ������
						room[i - 1] = 0;
						roomPwd[i - 1] = "";
						System.out.println("���� ��Ұ� �Ϸ�Ǿ����ϴ�.");
					} else {
						System.out.println("��й�ȣ�� Ʋ���ϴ� �ٽ� Ȯ���� �ּ���.");
					}

				} else {
					System.out.println("���� ���� ���� ���ȣ�Դϴ�.");
				}
			}
		}
	}

	/**
	 * New �� ���� ���
	 */
	private static void roomCheckOut(ArrayList<Object> roomList, int roomNum) {
		System.out.print("���� ��� �� �� ��ȣ�� �����ּ��� : ");
		roomNum = sc.nextInt();

		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor;
			if (tempRoom.isReserVation() == false) {
				if (roomNum == tempRoom.getRoomNum()) {
					System.out.print("���� ��й�ȣ�� �����ּ��� : ");
					strTemp = sc.next();
					if (pwdValueOf(tempRoom.getRoomPwd(), strTemp)) { // ���� ��й�ȣ ������
						tempRoom.setReserVation(true);
						tempRoom.setRoomPwd("0000");
						System.out.println("���� ��� �Ϸ�");
					} else {
						System.out.println("��й�ȣ ���� ���� ��Ҹ� �ٽ� ������ �ּ���.");
					}
				} else {
					System.out.println("���� ���� ���� ���ȣ�Դϴ�.");
				}
			} else {
				continue;
			}
		}
	}

	/**
	 * �� ����
	 */
	private static void roomCheckIn(int[] room, String[] roomPwd, int roomNum) {

		System.out.print("�� ��ȣ�� �Է����ּ��� : ");
		roomNum = sc.nextInt();
		if (valueOf(roomNum, room)) {
			System.out.println("���� �����մϴ�. ");
			System.out.println("���� �����մϴ�. ");
			roomCISave(room, roomPwd, roomNum);
		} else {
			System.out.println("����� �� ��ȣ �Դϴ�. ���� �Ұ��� �մϴ�.");
		}
	}

	/**
	 * New �� ����
	 */
	private static void roomCheckIn(ArrayList<Object> roomList, int roomNum) {

		System.out.print("���� �� �� ��ȣ�� �Է����ּ��� : ");
		roomNum = sc.nextInt();
		if (valueOf(roomList, roomNum)) { // ���� ���� ��
			roomCISave(roomList, roomNum);
		} else {
			System.out.println("���� �Ұ����� ȣ�� �Դϴ�.");
		}

	}

	/**
	 * �� ���� �� ��й�ȣ ����
	 */
	private static void roomCISave(int[] room, String[] roomPwd, int roomNum) {
		// �� ��й�ȣ ����
		System.out.print("�� ���� ��й�ȣ�� �Է��� �ּ���. (4�ڸ�) : ");
		for (int i = 0; i < roomPwd.length; i++) {
			if (roomNum == i) {
				roomPwd[i - 1] = sc.next();
				room[i - 1] = 1;
			} else {
				continue;
			}
			System.out.print(i + "�� �� ��й�ȣ" + roomPwd[i - 1]);
		}
	}

	/**
	 * New �� ���� �� ��й�ȣ ����
	 */
	private static void roomCISave(ArrayList<Object> roomList, int roomNum) {
		// �� ��й�ȣ ����
		System.out.print("�� ���� ��й�ȣ�� �Է��� �ּ���. (4�ڸ�) : ");
		strTemp = sc.next();
		Room tempRoom = new Room();
		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor; // �ӽ� ���� ��ü�� �븮��Ʈ���� ���� ��ü�� ��´�
			if (tempRoom.getRoomNum() == roomNum && tempRoom.isReserVation() == true) { // �Է��� roomNum ���� ���� tempRoom
																						// ��ü���� �ϰ� �װ�ü�� ���൵ ������ ���¶��
				tempRoom.setRoomPwd(strTemp); // �ۼ��� ��й�ȣ add
				tempRoom.setReserVation(false); // ���� �Ұ� ���� ON
				System.out.println(tempRoom.getRoomNum() + "�� �� ���� �Ϸ�");
				System.out.println("ó�� ȭ������ ���ư��ϴ�..");
			} else {
				continue;
			}
		}
	}

	/**
	 * �ȳ� ����
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

		System.out.println("1.�� ����.");
		System.out.println("2.���� ���.");
		System.out.println("3.ȣ�� Ȯ��.");
		System.out.println("99.����");
		System.out.print("�޴� ���� : ");

		return sc.nextInt();
	}

	/**
	 * �� ȣ�� Ȯ��
	 */
	private static void roomSearuch(int[] room) {
		for (int i = 0; i < room.length; i++) {
			if (room[i] == 1) {
				if (i % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + (i + 1) + "]" + "���� ���� �Ұ� :");
			} else {
				if (i % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + (i + 1) + "]" + "���� ���� ���� : ");
			}

		}
	}

	/**
	 * New �� ȣ�� Ȯ��
	 */
	private static void roomSearuch(ArrayList<Object> roomList) {
		Room tempRoom = new Room();
		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor; // �ӽ� ���� ��ü�� �븮��Ʈ���� ���� ��ü�� ��´�

			if (tempRoom.isReserVation()) {
				if (tempRoom.getRoomNum() % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + tempRoom.getRoomNum() + "]" + "�� ���� :");
			} else {
				if (tempRoom.getRoomNum() % 10 == 0) {
					System.out.println();
					System.out.println();
				}
				System.out.print("[" + tempRoom.getRoomNum() + "]" + "���� �Ұ��� : ");
			}
		}

	}

	/**
	 * ���� �� ��
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
	 * New ���� �� �� ArrayList<Room> roomList
	 */
	private static boolean valueOf(ArrayList<Object> roomList, int roomNum) {
		Room tempRoom = new Room();
		for (Object roomFor : roomList) {
			tempRoom = (Room) roomFor;
			if (tempRoom.getRoomNum() == roomNum) {
				if (tempRoom.isReserVation()) {
					System.out.println("���� �����մϴ�. ������ �����մϴ�.");
					return true;
				} else {
					System.out.println("�̹� ���� �� ȣ���Դϴ�. ");
					System.out.println("ó������ ���ư��ϴ�.");
					return false;
				}
			} else if (tempRoom.getRoomNum() != roomNum) {
				continue;

			} else {
				System.out.println("�������� ���� ȣ���Դϴ�. �����ڿ��� �����ϼ���.");
			}
		}
		return false;
	}

	/**
	 * ��й�ȣ�� ������ true : ��й�ȣ�� Ʋ���� false
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

	/**
	 * New ��й�ȣ�� ������ true : ��й�ȣ�� Ʋ���� false
	 */
	private static boolean pwdValueOf(String roomPwd, String pwd) {

		if (roomPwd.equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}

	private static void adminMod() {
		// ������ �����Ұ� �� ������
		// ���� ����
		// �� �̸� ����
		System.out.println("������ ���");
		System.out.println();

	}

}
