package kr.co.dong.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.StringTokenizer;

public class TokenTest02 {

	public static void main(String[] args) throws IOException {
		String str = ""; // 읽어온 문자열 라인을 저장할 변수
		StringTokenizer st = null;
		LineNumberReader lNReader = null;
		lNReader = new LineNumberReader(new FileReader("student.txt")); // 읽어 올 파일
		while (true) {
			str = lNReader.readLine(); // 텍스트 파일의 한 줄 읽어오기
			if (str == null)
				break;
			st = new StringTokenizer(str, ","); // , 를 기준으로 토큰화
			int lNo = lNReader.getLineNumber(); // LineNumberReader 활용 Number 표기
			System.out.print(lNo + " : ");
			int count = st.countTokens();
			for (int i = 0; i < count; i++) { // 한줄
				System.out.print(" " + st.nextToken());
			}
			System.out.println();
		}
	}
}
