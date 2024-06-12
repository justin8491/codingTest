package kr.co.dong.arraylist;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

	public static void main(String[] args) {
//		컬렉션프레임워크 Map 사용하기

//		국가별 수도 표시하기
		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("미국", "워싱턴");
		map.put("캐나다", "오타와");
		map.put("일본", "도쿄");
		map.put("대한민국", "서울2");

		System.out.println("대한민국 수도는 : " + map.get("대한민국"));

		System.out.println(map);

//		Key : 이름, value : 나이
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("유종현", 28);
		map2.put("장현세", 22);
		map2.put("윤채영", 22);
		
		
		System.out.println(map2);
		
		

	}

}
