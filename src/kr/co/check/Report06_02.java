package kr.co.check;

import java.util.Scanner;

/* �ҽ� : �������Ǳ�V1.0
 * �ۼ��� : 24.04.29
 * �ۼ��� : ��ö��
 * Ŭ�������� : ȫ�浿�� ��ȣ�� 33�ΰ�� Report33
 *          -> ������ �Ͼ�� Report33_01
 *     1. ������ ������ 3���� 
 *   - �̸�, ����, ������ ������
 *   2. ������ ���������� ��� �����մϴ�.
 */
public class Report06_02 {
	public static void main(String[] args) {

		String cola = "�ݶ�";
		String cider = "���̴�";
		String juice = "�ֽ�";

		int colaPrice = 1000;
		int ciderPrice = 1200;
		int juicePrice = 1500;

		int colastorage = 5;
		int cidertorage = 2;
		int juicetorage = 10;

		
		int choice = 0;
		int balance = 0;
		int money = 0;

		Scanner scan = new Scanner(System.in);

		
		while (true) {
			
			
			System.out.println("1.�ݶ� 2.���̴� 3.�ֽ� 4.�ݾ� ���� 5.����");
			System.out.print("�޴� ���� : ");
						
			choice = Integer.parseInt(scan.nextLine());
										
			 if (choice == 5) {
				System.out.println("���� Off");
				System.out.println("�ܵ� "+money+"�� ��ȯ");
				break;
			}			
			 else if (choice == 4) {
				 System.out.print("���� �����Ͻÿ� : ");
					money +=  Integer.parseInt(scan.nextLine());
			}
			 
					 
			 else if ((colastorage <= 0 && choice == 1)||(cidertorage <= 0 && choice == 2)||(juicetorage <= 0 && choice == 3)){
				 System.out.println("��� ��� ���������ϴ�.");	
			}		
					
			 else if (choice == 1) {
				 System.out.println(cola + " ����");			
				
					if (money < colaPrice && choice == 1) {
						System.out.println("�ݾ��� �����մϴ�.");
						break;
					}
				 
					colastorage = colastorage - 1;
				System.out.println(colaPrice + "�� �����Ͽ����ϴ�.");
				money = money - colaPrice;
				System.out.println("�ܵ��� "+money+"�� �Դϴ�.");
				System.out.println("���� ���� �ݶ� ��� : " + colastorage);

			} else if (choice == 2) {
				System.out.println(cider + " ����");
				
				
				if (money < ciderPrice && choice == 2) {
					 System.out.println("�ݾ��� �����մϴ�.");
					 break; 
					}
				
				cidertorage = cidertorage - 1;
				System.out.println(ciderPrice + "�� �����Ͽ����ϴ�.");
				money = money - ciderPrice;
				System.out.println("�ܵ��� "+money+"�� �Դϴ�.");
				System.out.println("���� ���� ���̴� ��� : " + cidertorage);
			} 
			else if (choice == 3) {
				System.out.println(juice + " ����");
			
				if (money < juicePrice && choice == 3) {
					 System.out.println("�ݾ��� �����մϴ�.");
					 break;
					}
				
				juicetorage = juicetorage - 1;
				System.out.println(juicePrice + "�� �����Ͽ����ϴ�.");
				money = money - juicePrice;
				System.out.println("�ܵ��� "+money+"�� �Դϴ�.");
				System.out.println("���� ���� �ֽ� ��� : " + juicetorage);
			}
			else if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 ) {
				System.out.println("��ȣ�� �ùٸ��� �ʽ��ϴ�.");
			}
			 
			System.out.println();
		}

	}
}
