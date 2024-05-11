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
//		2. ���� �� ��ŭ ��ü�� �ʿ� ��´�.
//		3. ���� ���� �޼��忡 �����Ѵ�.

		// �����
		int roomNum = 0; // �� ��ȣ
		int menuNum = 0; // �޴� ��ȣ

		// new ���� >>
		String roomName = ""; // �� �̸�
		int numOfRoom = 0; // ���� �ο�
		int price = 0; // ����

		// ���� �� >>
		int roomCount = 0;
		System.out.print("���� ũ�⸦ �Է����ּ��� : ");
		roomCount = sc.nextInt();

//		List<String> roomList = new ArrayList<String>();
//		Map<String, Object> roomList = new HashMap<String, Object>();

		ArrayList<Object> roomList = new ArrayList<Object>();
		// �Ʒ��� ���� ������ roomNum �� roomList
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

//			��ü ����

//			���� ��ü �ʿ� ���

			// ����
			int tempToF = i % 10;
			String tempToFS = "1";
			if (tempToF == 0 && i != 0) {
				// i ���� 1~9 ���̰� �ƴҶ�
				tempToFS = (Integer.parseInt(tempToFS) + 1) + "";
				tempToFS = tempToFS + "0" + tempToF;
			} else if (tempToF != 0 || i == 0) {
				// i ���� 1~9 ���� �� ��
				tempToFS = tempToFS + "0" + tempToF;
			}
			Room hostell = new Room(Integer.parseInt(tempToFS), "���Ĵٵ�" + i, numOfRoom, price);
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
	 * �� ���� ���
	 * 
	 * @param room
	 * @param roomPwd
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
	 * �� ����
	 * 
	 * @param room
	 * @param roomPwd
	 * @param roomNum
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
	 * �ȳ� ����
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

		System.out.println("1.�� ����.");
		System.out.println("2.���� ���.");
		System.out.println("3.ȣ�� Ȯ��.");
		System.out.println("99.����");
		System.out.print("�޴� ���� : ");
	}

	/**
	 * �� ȣ�� Ȯ��
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
	 * ���� �� ��
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
	 * ��й�ȣ�� ������ true : ��й�ȣ�� Ʋ���� false
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
