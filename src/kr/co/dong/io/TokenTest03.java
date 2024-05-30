package kr.co.dong.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.StringTokenizer;

public class TokenTest03 {

	public static void main(String[] args) throws IOException {
//		String str = "";
//		String title = "이름,나이,학번,학과";
//		StringTokenizer st = null;
//		StringTokenizer titleST = null;
//		LineNumberReader lNReader = null;
//		lNReader = new LineNumberReader(new FileReader("student.txt"));
//		while (true) {
//			str = lNReader.readLine();
//			if (str == null)
//				break;
//			st = new StringTokenizer(str, ",");
//			int lNo = lNReader.getLineNumber();
//			int count = st.countTokens();
//			titleST = new StringTokenizer(title, ",");
//			for (int i = 0; i < count; i++) { // 한줄
//
//				System.out.println(titleST.nextToken() + " : " + st.nextToken());
//			}
//			System.out.println();
//		}
		String title = "이름,나이,학번,학과";
		String[] titles = title.split(",");

		try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(",");
				for (int i = 0; i < tokens.length && i < titles.length; i++) {
					System.out.println(titles[i] + " : " + tokens[i]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
