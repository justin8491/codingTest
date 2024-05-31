/*
 * ȣ�� ���� ���α׷� �����ϱ� ver1.0
 * - ȣ�ڹ� : ȣ��, ���̸�,  ����, ����, ��������(����), �����ڸ�, �����ڵ�
 * - �濹�� : �����ڸ�, �����ڵ�, ȣ��
 * - ��� : �����ϱ�, ��������ϱ�, ȣ�ڷ� Ȯ���ϱ�, �޴������ֱ�, �帧�����ֱ�
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
//		ȣ�ڷ�(5��)�� ������ ���� -> List		
//		
		List<Room> list = new ArrayList<Room>();
		boolean stop = false;

//		ȣ���� �� ������ �ʱ�ȭ�ϰ� ����
		init(list);
//		startInfo();
		while (!stop) {
			int sel = menu();

			switch (sel) {
			case 1: // �� �����ϱ�
				revRoom(list);
				break;
			case 2: // �� ���� ���
				canselRoom(list);
				break;
			case 3: // �� ��üȮ��/ ����Ȯ��
				printRoom(list);
				break;
			case 4: // ������ ����Ȯ��
				customer(list);
				break;
			default:

			}

		}

	}

	private static void customer(List<Room> list) {
		System.out.print("������ �� ��ȣ�� �Է����ּ��� : ");
		int rNo = sc.nextInt();
		for (Room r : list) {
			if (r.getrNo() == rNo && r.isCheck() == true) {
				System.out.println("������ : " + r.getCustomer());
				System.out.println("���� ��ȣ : " + r.getRevCode());
			} else if (r.getrNo() == rNo && r.isCheck() == false) {
				System.out.println("���� �������� �� �Դϴ�. �ٽ� �õ����ּ���.");
			}
		}
	}

	private static int menu() {
		System.out.println("=======================================================");
		System.out.println("1. �����ϱ� 2. ���� ��� 3. ������ȸ ��ü/���� 4. ������ ����Ȯ��");
		System.out.println("=======================================================");
		return sc.nextInt();
	}

//	list���� �ش� ������ ����Ǿ� �ִ� index�� ã�� �޼ҵ�
//	���ȣ�� ã��? ���̸����� ã��
	private static int findRoom(int rNo, List<Room> list) {
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
//			list.get(i).getrName() => ����Ʈ���� ���̸�
			if (rNo == list.get(i).getrNo()) {
				index = i;
				break;
//				return index;
			}
		}
		return index;
	}

	private static void canselRoom(List<Room> list) {
		System.out.print("���� �Ͻ� �� ��ȣ�� �Է� ���ּ��� : ");
		int rNo = sc.nextInt();
		System.out.print("������ ������ �Է� ���ּ��� : ");
		String rCustomer = sc.next();
		for (Room r : list) {
			if (r.getrNo() == rNo && r.getCustomer().equals(rCustomer)) {
				r.setRevCode(null);
				r.setCustomer(null);
				r.setCheck(false);
				System.out.println(r.getrNo() + "���� ���� ��ҵǾ����ϴ�.");
			}
		}

	}

	public static void printRoomNo(List<Room> list) {
		int f = 0; // ���� ó��
		for (Room r : list) {
			System.out.print("[" + r.getrNo() + "]" + "�� : ");
			f++;
			if (f % 5 == 0) {
				System.out.println();
			}
		}
	}

	private static void revRoom(List<Room> list) {
		printRoomNo(list);
		System.out.print("���� �� �� ��ȣ�� �Է� �ϼ��� : ");
		int rNo = sc.nextInt();
		System.out.print("������ ������ �����ּ��� : ");
		String customer = sc.next();
		for (Room r : list) {
			if (r.getrNo() == rNo && r.getRevCode() == null && r.getCustomer() == null) {
				r.setCheck(true);
				r.setRevCode(createRevCode());
				r.setCustomer(customer);
				System.out.println("���� �Ϸ� �Ǿ����ϴ�.");

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
		System.out.println("1.��üȣ��Ȯ�� 2.����ȣ��Ȯ��");
		int sel = sc.nextInt();
		if (sel == 1) {
			for (Room r : list) {
				System.out.println(r);
			}
		} else if (sel == 2) {
			System.out.print("�� ȣ���� �Է� �� �ּ��� : ");
			int rNo = sc.nextInt();
			System.out.println(list.get(findRoom(rNo, list)).isCheck() == false ? rNo + " ���� ����" : rNo + " ���� �Ұ���");
		}
	}

	private static void init(List<Room> list) {
		Room r1 = new Room(5323, "�ҳ���", 20000, "��� ��");
		Room r2 = new Room(13232, "������", 20000, "��� ��");
		Room r3 = new Room(3123, "���鳪��", 20000, "��� ��");
		Room r4 = new Room(3213, "������", 20000, "��� ��");
		Room r5 = new Room(412, "���೪��", 20000, "��� ��");

//		�� ����
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(r5);
	}

}
