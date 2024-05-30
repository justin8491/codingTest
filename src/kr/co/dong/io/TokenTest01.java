package kr.co.dong.io;

import java.io.IOException;
import java.util.StringTokenizer;

public class TokenTest01 {

	public static void main(String[] args) throws IOException {
		String str = "사과,배,소나무,감,감나무,배나무,참외";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int count = st.countTokens();
		System.out.println(", 를 기준으로 잘라낸 토큰 개수 : " + count); 

		
		//토큰 개수 만큼 반복문으로 출력
		for (int i = 0; i < count; i++) {
			String data = st.nextToken();
			System.out.println(data);
		}

	}

}
