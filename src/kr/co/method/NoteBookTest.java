package kr.co.method;

import java.util.Scanner;

public class NoteBookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int price;
		
		
		
		
		System.out.print("��Ʈ�� �̸��� �Է����ּ��� : ");
		name = sc.nextLine();
		
		System.out.print("��Ʈ�� ������ �Է����ּ��� : ");
		price = sc.nextInt();

		Notebook noteBook = new Notebook(name, price);
		Notebook noteBook1 = new Notebook();
		
		noteBook.printNotebook(name, price);
		noteBook1.printNotebook(noteBook1.getName(), noteBook1.getPrice());
		
		
	}

}
