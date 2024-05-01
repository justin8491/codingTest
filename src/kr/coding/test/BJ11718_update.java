package kr.coding.test;

import java.util.*;

public class BJ11718_update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrStr = new ArrayList<String>();
		String str = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			if (str.isEmpty() || str.endsWith(" ") || str.startsWith(" ") || str.length() > 100) {
				break;
			}
			arrStr.add(str);
		}
		sc.close();
		for (int i = 0; i < arrStr.size(); i++) {
			System.out.println(arrStr.get(i));
		}

	}

}
