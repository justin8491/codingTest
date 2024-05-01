package kr.co.check;

import java.util.Scanner;

public class Report20_2 {
	public static void main(String[] args) {

		String menu[] = { "��ī�ݶ�", "���", "���̴�" };
		long price[] = { 1500, 1800, 1200 };
		int stock[] = { 1, 1, 1 };
		int Number = 0;
		long jibul = 0L, lose = 0L, box1 = 0L;
		boolean shutdown = false, chaack = false;
		Scanner scan = new Scanner(System.in);

		while (!shutdown) {
// �����Ʈ
			System.out.println("==========menu===========");
			for (int i = 0; i < menu.length; i++) {
				System.out.print((i + 1) + "\t");
				System.out.print(menu[i] + "\t");
				System.out.print(price[i] + "\t");
				System.out.print(stock[i] + "\n");
			}
			System.out.print("����: ");
			Number = scan.nextInt() - 1;
//menu�� ���� ���� ���� ���
			if (Number > menu.length) {
				System.err.println("�޴��� �����ϴ�.");
				break;
			}
//����� �Է� ���� ������ ��� ���� �� ����ϱ�
			if (stock[Number] <= 0) {
				System.out.println("�� ��ǰ�� ǰ�� ��ǰ�Դϴ�.");
				break;

			} else if (stock[Number] > 0) {
				System.out.printf("%s�� ���� %d�ݾ��� �������ֽñ� �ٶ��ϴ�. : ", menu[Number], price[Number]);
				jibul = scan.nextLong();

				// �ݾ��� �����Ҷ� ��Ե� �޾Ƴ��� (���� ����)
				
				if (jibul < price[Number]) {
					do {

						lose = price[Number] - jibul;
						System.out.printf("�մ� ���� �� �Ҷ� ���� �ݾ� ���ּ��� ^^ : %d", lose);
						System.out.print("�ּ��� : ");
						jibul += scan.nextLong();
						
						if (jibul >= price[Number]) {
							chaack = true;
						}

					}while (!chaack);
					stock[Number]--;
					System.out.println(menu[Number] + "�� ��ǰ �������ּ���");

				} else if (jibul > price[Number]) {
					System.out.println("��ǰ�� �帮�ڽ��ϴ�.");
					System.out.print("�ܵ��Դϴ� : ");
					System.out.print(jibul - price[Number] +"\n");
//					jibul = 0;
//					System.out.println("���� �ݾ� : ");
//					System.out.println(jibul);
					stock[Number]--;
				} else {
					System.out.println(menu[Number] + "�� ��ǰ�� �帮�ڽ��ϴ�.");
					stock[Number]--;
				}

			}

			// ��� Ȯ�� �ڵ�
			if (stock[0] == 0 && stock[1] == 0 && stock[2] == 0) {
				shutdown = true;
			}

		}

	}
}
