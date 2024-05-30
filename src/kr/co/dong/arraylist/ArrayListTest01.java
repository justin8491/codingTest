package kr.co.dong.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("포도"); // idx 0 List list[0] = "포도"
		list.add("사과"); // idx 1 List list[1] = "사과"
		list.add("딸기"); // idx 2 List list[2] = "딸기"

		System.out.println("GET Start");
		// 출력
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		for (String str : list) {
			System.out.println(str);
		}

		// set
		list.set(0, "오렌지");
		list.set(1, "딸기");
		list.set(2, "사과");
		list.add(3, "수박");

		System.out.println("SET Start");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

//		for (String str : list) {
//			if (str.equals("딸기")) {
//				list.remove(list.indexOf("딸기"));
//			}
//		}

		String delStr = "딸기";
		System.out.println("딸기 Delete");
		int idx = -1;
		for (String str : list) {
			System.out.println(str);
			if (delStr.equals(str)) {
				System.out.println("있어?..");
				idx = list.indexOf("딸기");
				break;
			}
		}
		if (idx == -1) {
			System.out.println("찾는 데이터가없습니다.");
		} else {
			list.remove(list.indexOf("딸기"));
			System.out.println("삭제 되었습니다.");
			System.out.println();

			System.out.println("삭제 후 출력 ");
			for (String str : list) {
				System.out.println(str);
			}
		}
		
		System.out.println("======================================");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

	}

}
