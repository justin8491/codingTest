package kr.co.oop.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	
	static final String NAME_PATH = "김";
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			names.add(sc.next());
		}
		
		for(String name : names) {
			if(name.equals("김"))
		}
	}

}
