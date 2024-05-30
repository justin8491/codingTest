package kr.co.oop.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	static final String NAME_PATH = "김";

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		// 5개의 이름 받기
		for (int i = 0; i <= 4; i++) {
			names.add(sc.next());
		}

		// 성 찾기
		for (String name : names) {
			boolean idx = name.indexOf(NAME_PATH) != -1 ? true : false;
			if (idx) {
				System.out.println("김씨 성 : " + name);
			} else {
				continue;
			}
		}
	}

}
