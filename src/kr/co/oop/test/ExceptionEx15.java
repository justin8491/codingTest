package kr.co.oop.test;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionEx15 {
	public static void main(String[] args) throws IOException {
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
//		File f = createFile("제목있음.txt");
		File f = new File("src/newFile03.txt");
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		// 파일에 작성시 작성 생성자 선언 법
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));

		pw.print("아 날씨좋다~~~~~~ \n 집가고 싶다~~~~~");
		pw.close();
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	} // createFile 끝

	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
		}
	} // createNewFile 끝
}
