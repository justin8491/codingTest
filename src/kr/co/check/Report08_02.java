package kr.co.check;

import java.util.Scanner;

public class Report08_02 {
	public static void main(String[] args) {
		int money = 0;  // money
		int sel = 0;
		String dName1 = "�ͽ�Ŀ��", dName2 = "��Ŀ��", dName3 = "���ھ�";
		int price1 = 300, price2 = 300, price3 = 500;
		int jaego1 =2, jaego2=3, jaego3 =10;
	
		Scanner scan = new Scanner(System.in);		
		boolean stop = false;
		

		while(!stop) {
				
			System.out.println("� ���Ḧ ���ðڽ��ϱ�?");
			System.out.println("1�ͽ�Ŀ�� 2.��Ŀ�� 3.���ھ� 4.Input money  99.End ");
			
			
			System.out.println("���� ������ : " + money +" ��");
			System.out.print("Selete Munber : ");
			sel = Integer.parseInt(scan.nextLine());
			switch (sel) {
			
			case 1:	
				if(money<price1) {
					System.out.println("not money");
				}else if(jaego1<=0) {
					System.out.println("not jaego");
					
				}else {
					System.out.println(dName1 + " ");
					money = money-price1;
					jaego1--;
					System.out.println("��� : " +jaego1);
				}
				break;
			case 2:	
				if(money<price2) {
					System.out.println("not money");
				}else {
					System.out.println(dName2 + " ");
					money = money-price2;
					jaego2--;
					System.out.println("��� : " +jaego2);
				}
				break;
			case 3:			
				if(money<price3) {
					System.out.println("not money");
				}else {
					System.out.println(dName3 + " ");
					money = money-price3;
					jaego3--;
					System.out.println("��� : " +jaego3);
				}
				break;
		
			case 4:
				System.out.println("���� �־��ּ���");
				money += Integer.parseInt(scan.nextLine());				
				System.out.println(money + "���� �����̽��ϴ�");
				break;
				
			case 77:
//				������ ��� : ��ǰ��,����,��� �����ϱ�
				break;
			case 99:
				stop = true;
				break;
			default:
				
				
			}
			System.out.println("==========");
		}
		System.out.println("program End!!");

	}

}
