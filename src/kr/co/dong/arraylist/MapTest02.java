package kr.co.dong.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import kr.co.dong.dbtest.Member;
import member.Student;

public class MapTest02 {

	public static void main(String[] args) {
//		컬렉션프레임워크 Map 사용하기
//		국가별 수도 표시하기
		Map<String, Object> map = new HashMap<String, Object>();
		ArrayList<Member> stList = new ArrayList<Member>();

		stList.add(new Member("root", "1234"));

		map.put("stList", stList);

		System.out.println(map);
	}

}
