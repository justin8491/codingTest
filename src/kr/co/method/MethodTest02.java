package kr.co.method;

import java.util.Scanner;

public class MethodTest02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintCount pc = new PrintCount();
//		���ڿ��� �ܼ��� �Է¹޾Ƽ� ����ϴ� �Լ� 
		pc.print("���� ���� �쵿���� ���Ŵ�.", 5);
		
		//�Լ��� �ܼ� �Է¹޾� ������ ���
		
		pc.printGoogoodan(3);
		
	}

}
