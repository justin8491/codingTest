package kr.co.check;

import java.util.Scanner;

public class Report20_01 {
	public static void main(String[] args) {

		String menu[] = { "��ī�ݶ�", "���", "���̴�" };
		long price[] = { 1500, 1800, 1200 };
		int stock[] = { 1, 1, 1 };
		int Number = 0;
		long jibul = 0L, lose = 0L, namuji = 0L;
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
			System.out.println();
			System.out.println("�ܵ���ȯ(66)			��������(99)");
			System.out.print("����: ");
			Number = scan.nextInt() - 1;

			if (Number == 98) {
				shutdown = true;

			} else if (0 <= Number && Number != 65 && Number != 77 && Number != 98) {

//����� �Է� ���� ������ ��� ���� �� ����ϱ�
				if (stock[Number] == 0) {
					System.out.println("�� ��ǰ�� ǰ�� ��ǰ�Դϴ�.");

				} else if (stock[Number] > 0) {
					System.out.printf("%s�� ���� %d�ݾ��� �������ֽñ� �ٶ��ϴ�. : ", menu[Number], price[Number]);
					jibul = scan.nextLong() + namuji;
//				System.out.println(jibul);

					// �ݾ��� �����Ҷ� ��Ե� �޾Ƴ��� (���� ����)

					if (jibul < price[Number]) {
						do {

							lose = price[Number] - jibul; // ������ ��
							System.out.printf("�մ� ���� �� �Ҷ� ���� �ݾ� ���ּ��� ^^ : %d", lose);
							System.out.print("�ּ��� : ");
							if (jibul >= price[Number]) {
								namuji = jibul - lose;
								jibul = 0;
								chaack = true;
							}

							jibul += scan.nextLong();

						} while (!chaack);
						stock[Number]--;
						jibul = 0;
						System.out.println(menu[Number] + "�� ��ǰ �������ּ���");
						System.out.print("�ܵ��Դϴ� : ");
						System.out.print(namuji);

					} else if (jibul > price[Number]) {
						System.out.println(menu[Number] + "�� ��ǰ�� �帮�ڽ��ϴ�.");
						System.out.print("�ܵ��Դϴ� : ");
						System.out.print(jibul - price[Number] + "\n");
						namuji = jibul - price[Number];// ���� ��
						jibul = 0;// ���� �ʱ�ȭ

//					jibul = 0;
//					System.out.println("���� �ݾ� : ");
//					System.out.println(jibul);

						stock[Number]--;

					} else {
						System.out.println(menu[Number] + "�� ��ǰ�� �帮�ڽ��ϴ�.");
						jibul = 0;
						stock[Number]--;
					}

				}

				// menu�� ���� ���� ���� ���
				if (Number > menu.length + 1) {
					System.out.println("�޴��� �����ϴ�.");
					break;

				}

//			System.out.println(jibul);

				// ��� Ȯ�� �ڵ�
				if (stock[0] == 0 && stock[1] == 0 && stock[2] == 0) {
					shutdown = true;
				}

			} /* else if(while��) end */else if (Number == 65) {
				System.out.printf("�ܵ��� �帮�ڽ��ϴ�. : %d", namuji);// ������ �� ��ȯ
				shutdown = true;

			} else if (Number == 77) {

			}
		} // while

	}
}
