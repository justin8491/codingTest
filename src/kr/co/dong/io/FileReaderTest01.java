package kr.co.dong.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReaderTest01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fName = "test.txt";
		String fwName = "output.txt"; // 쓰기 파일 명
		File f = new File(fwName);

//		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));

//		pw.print("아 날씨좋다~ \n 삽겹살 먹고싶은 날씨다~~~");
//		pw.close();
		String str = "오늘은 날씨가 좋아서 삼겹살을 먹어야 겠습니다.";
		FileReader fReader = new FileReader(fName);
		FileWriter writer = new FileWriter(fwName);

		while (true) {
			int data = fReader.read();
			if (data < 0) {
				break;
			}
			char ch = (char) data;

			System.out.println(ch);
			System.out.println("data : " + data);

//			읽은 데이터를 쓰기파일에 넣기

		}
		writer.write(str);
		fReader.close();
		writer.close();

	}
}
