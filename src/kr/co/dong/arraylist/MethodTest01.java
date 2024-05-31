/*  ArrayList or LinkedList   : .add()  .get()  .set()  .remove()
 * ���ɽĻ� �޴� ���� ���α׷� ver1.0
 * 1. �޴��߰� 2. �޴����� 3. �޴����� 4.�޴���ü���� 99.����
 * �޴��� �ִ� 10����, �ʱⰪ���� ��ġ������,¥����� �Է��Ѵ�.
 */
package kr.co.dong.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodTest01 {
	static Scanner scan = new Scanner(System.in);
	// ������ �޴������� delfood
	static ArrayList<String> delfood = new ArrayList<String>();

	static void initmenu(ArrayList<String> food) {// �ʱⰪ
		food.add("��ġ������");
		food.add("¥���");
		food.add("�������");
		food.add("ȸ����");
	}

	public static int menu() {
		System.out.println("\n-------�޴�-------");
		System.out.println("1. �޴��߰�.");
		System.out.println("2. �޴�����.");
		System.out.println("3. �޴�����");
		System.out.println("4. ��ü����");
		System.out.println("99. ����");
		System.out.print("�޴���ȣ�� �����ϼ��� : ");

		return Integer.parseInt(scan.nextLine());
	}

	static void addfood(ArrayList<String> food) {
//		�޴��� �ִ��� ����?
		System.out.println("�߰��� �޴��� �Է��ϼ���.!!");
		String tmp = "";
		do {
			tmp = scan.nextLine();
		} while (food.contains(tmp)); // .contains() T/F ����
		// ���� �޴��̹Ƿ� �߰�
		food.add(tmp);

	}

	static void selectfood(ArrayList<String> food) {
		System.out.println("�޴�����");
		printfood(food, 1); // �޴������ְ�
		System.out.println(food.get(Integer.parseInt(scan.nextLine()) - 1));

	}

	static void removefood(ArrayList<String> food) {	
		int num = 0;
		System.out.println("�޴�����");
		printfood(food, 1);

		System.out.print("������ �޴���ȣ�� �Է��ϼ���.");
//		����scan.nextLine().charAt(0)
		num = Integer.parseInt(scan.nextLine());

		// ������ �޴���ȣ�� food���� �������� delfood�� �����Ѵ�.
		delfood.add(food.get(num - 1));

		food.remove(num - 1); // food���� �޴��̸�����

		System.out.println("�����Ǿ����ϴ�.");

	}

	static void printfood(ArrayList<String> food, int num) {
		if (num == 1) {
			System.out.println("��ü�޴�����");
		} else {
			System.out.println("�����޴�����");
		}
		for (int i = 0; i < food.size(); i++) {
			System.out.println((i + 1) + ". " + food.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>(); // ���ĸ޴�
		// �ʱ�޴�����
		initmenu(food);
		// �ȳ��� �ۼ�
		while (true) {
			switch (menu()) {
			case 1: // �޴��߰�
				addfood(food);
				break;
			case 2: // �޴�����
				selectfood(food);
				break;
			case 3: // �޴�����
				removefood(food);
				break;
			case 4: // �޴���ü����
				printfood(food, 1);
				break;
			case 5: // �����޴����� (�����ڿ�)
				printfood(delfood, 2);
			case 99: // ����
				break;
			default: // ���ù�ȣ �ٽ�
				break;
			}
		}

	}

}