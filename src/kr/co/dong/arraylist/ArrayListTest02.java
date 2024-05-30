package kr.co.dong.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kr.co.dong.check5.Monitor;

public class ArrayListTest02 {

	public static void main(String[] args) {
		List<Monitor> list = new ArrayList<Monitor>();
		Monitor m1 = new Monitor("샘송1", "검은색", "45000");
		Monitor m2 = new Monitor("샘송2", "검은색", "35000");
		Monitor m3 = new Monitor("샘송3", "검은색", "25000");
		Monitor m4 = new Monitor("샘송4", "검은색", "15000");

//		list 추가
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);

		for (Object obj : list) {
			Monitor m = (Monitor) obj;
			System.out.println("모니터 명 : " + m.getName() + " 색상 : " + m.getColor() + " 가격 : " + m.getPrice());
		}

		for (int i = 0; i < list.size(); i++) {
			Monitor m = list.get(i);
			System.out.println("모니터 명 : " + m.getName() + " 색상 : " + m.getColor() + " 가격 : " + m.getPrice());
		}

	}

}
