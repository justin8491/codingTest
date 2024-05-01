package kr.co.check;

import java.util.Scanner;

public class Report15_08 {
	public static void main(String[] args) {
		/*
		 * �ҽ� : �������Ǳ� V1.0 �ۼ��� : ������ Ŭ�������� : Report15 -> ������ �Ͼ�� Report15_01 1 : ������������
		 * 3���� - �̸� , ���� , ������ ������. 2 : ������ ���� �� ���� ��� �����մϴ�.
		 */

		Scanner scan = new Scanner(System.in);

		int money = 0;		
		
		int number = 0;

		String[] drink = { "���", "Ŀ��", "ȯŸ" }; // ������ ����

		int[] price = { 1500, 1500, 2500 };

		int[] jaego = { 7, 5, 9 };

		int lackmoney = 0;

		boolean power = false; // ���Ǳ� while ����

		boolean manager = false; // �����ڸ�� while ����

		String turnoff = "������ �����ϴ�.";
		String managerend = "�����ڸ�带 �����մϴ�.";
		String correct = "�ùٸ� ��ȣ�� �Է����ּ���.";
		String line = "===================================";

		while (!power) {
			System.out.println(line);
			System.out.printf("|0.�ݾ׳ֱ�			  |%n|1.%s %d�� %d��		  | %n|2.%s %d�� %d��		  "
					+ "| %n|3.%s %d�� %d��		  | %n|4.�Ž�����			  | %n|99.off				  |%n", 
					drink[0], price[0],jaego[0],drink[1], price[1],jaego[1],drink[2],price[2],jaego[2]);
			System.out.println(line);
			System.out.println("| �ܾ� |" + money 	+"��			  |");
			System.out.println(line);
			number = scan.nextInt();
			switch (number) {
			case 0:
				System.out.println(line);
				System.out.println("�ݾ��� �־�(�Է�)���ּ���.");
				System.out.println(line);
				money = money + scan.nextInt(); // ���� �ݾ��� �Է��ϼ���.
				System.out.println(money);
				break;
			case 1: case 2: case 3:// case[0] : coke
				if (jaego[number-1] > 0 && money >= price[number-1]) {
					jaego[number-1] = jaego[number-1] - 1;
					money = money - price[number-1];
					System.out.println(line);
					System.out.printf("%s, ���� ��� %d��.%n", drink[number-1], jaego[number-1]);
				} else if (jaego[number-1] <= 0) {
					System.out.println(line);
					System.out.printf("%s�� ��� �����ϴ�. �ٸ��� ����ּ���.%n", drink[number-1]);
				} else {
					lackmoney = price[number-1] - money;
					System.out.println(line);
					System.out.printf("%s�� %d���Դϴ�.%n", drink[number-1], price[number-1]);
					System.out.printf("%d�� �����մϴ�. ���� �־��ּ��� %n",lackmoney);
				}
				break;
			case 4: // �Ž����� ������¥�� n�� ����¥�� n�� ��õ��¥�� n�� õ��¥��n�� 500��¥��n�� 100��¥��n�� 50��¥��n�� 10��¥�� n�� �������� ��ȯ
					// 66660���̸� 5����¥�� 1�� ����¥��1�� 5õ��¥��1�� õ��¥��1�� 500��¥��1�� 100��¥�� 1�� 50��¥��1�� 10��¥�� 1�� 
				int Omanwon = money / 50000;
				int manwon = (money%50000) / 10000;
				int ocheonwon = (money%10000) / 5000;
				int cheonwon = (money%5000) / 1000;
				int obagwon = (money%1000) / 500;
				int bagwon = (money%500) / 100;
				int oshibwon = (money%100) / 50;
				int shibwon = (money%50);
				System.out.println(line);
				System.out.printf("�Ž�����	%d��.%n", money);
				System.out.println(line);
				System.out.printf("5����¥�� %d��, ����¥�� %d��, 5õ��¥��%d��, õ��¥��%d��,%n500��¥��%d��, 100��¥��%d��, 50��¥��%d��, 10��¥�� %d���� ��ȯ�մϴ�%n"
						,Omanwon,manwon,ocheonwon,cheonwon,obagwon,bagwon,oshibwon,shibwon);
				money = 0;
				break;
			case 77: // ���⿡ ǥ�õ����ʴ� �����ڸ�� ���� // ���� ���ݼ��� �����ϰ�.
				System.out.println(line);
				System.out.println("������ ��带 �����մϴ�.");
				manager = false;
				while (!manager) {
					System.out.println(line);
					System.out.println("�����ϰ��� �ϴ� �۾��� ��ȣ�� �Է����ּ���.");
					System.out.println("1.������ 2.���ݰ��� 88.�����ڸ������");
					System.out.println(line);
					number = scan.nextInt();
					switch (number) {
					case 1:
						System.out.println(line);
						System.out.println("�������� �����ϼ̽��ϴ�. ������ �Ͻ÷��� ��ǰ�� �������ּ���.");
						System.out.println("1.coke 2.cider 3.coffee 88.�����ڸ������");
						number = scan.nextInt();
						switch (number) {
						case 1: case 2: case 3:
							System.out.println(line);
							System.out.printf("���� ���� %d�� �Դϴ�. ����� ������ �Է����ּ���.", jaego[number-1]);
							jaego[number-1] = scan.nextInt();
							System.out.println(line);
							System.out.printf("%s�� ����� ���� %d���Դϴ�.%n", drink[number-1], jaego[number-1]);
							break;
						case 88:
							System.out.println(line);
							System.out.println(managerend);
							manager = true;
							break;
						default:
							System.out.println(line);
							System.out.println(correct);
							break;
						}// end of case1�� switch
						break;
					case 2:
						System.out.println("���ݰ����� �����ϼ̽��ϴ�. ���ݰ��� �Ͻ÷��� ��ǰ�� �������ּ���.");
						System.out.println("1.coke 2.cider 3.coffee 88.�����ڸ������");
						number = scan.nextInt();
						switch (number) {
						case 1: case 2: case 3:
							System.out.printf("%n���� ������ %d �Դϴ�.������ ������ �Է����ּ���.", price[number-1]);
							price[number-1] = scan.nextInt();
							System.out.printf("%s�� ������ ������ %d���Դϴ�.%n", drink[number-1], price[number-1]);
							break;
						case 88:
							System.out.println(managerend);
							manager = true;
							break;
						default:
							System.out.println(line);
							System.out.println(correct);
							break;
						}
						break;
					case 88:
						System.out.println(line);
						System.out.println("���Ḧ �����ϼ̽��ϴ�.");
						System.out.println(managerend);
						manager = true;
						break;
					default:
						System.out.println(line);
						System.out.println(correct);
						break;
					} // end of case2�� switch
				}
				break;
			case 99:
				System.out.println("off�� �����ϼ̽��ϴ�.");
				System.out.println("�̿����ּż� �����մϴ�.");
				power = true;
				break;

			default:
				System.out.println(line);
				System.out.println(correct);
				break;
			} // end of switch����
			if (number == 99) {
				power = true;
				System.out.println(turnoff);
				break;
			} else if (jaego[0] == 0 && jaego[1] == 0 && jaego[2] == 0) {
				System.out.println(line);
				System.out.println("��� ��� �ٴڳ����ϴ�.");
				System.out.printf("���� �Ž����� %d���� ��ȯ�մϴ�.%n", money);
				System.out.println(turnoff);
				power = true;
				break;
			}

		} // end of while

	} // end of main
} // end of class