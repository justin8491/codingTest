package kr.co.method;

import java.util.Scanner;

public class NoteBookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int price;
		
		
		
		
		System.out.print("노트북 이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		System.out.print("노트북 가격을 입력해주세요 : ");
		price = sc.nextInt();

		Notebook noteBook = new Notebook(name, price);
		Notebook noteBook1 = new Notebook();
		
		noteBook.printNotebook(name, price);
		noteBook1.printNotebook(noteBook1.getName(), noteBook1.getPrice());
		
		
	}

}
