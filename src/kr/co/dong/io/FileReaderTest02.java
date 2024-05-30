package kr.co.dong.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest02 {
	public static void main(String[] args) throws IOException {
//		1. 읽을 파일의 경로와 속성
		String fileName = "poem.txt";

//		2. 주 읽기(1)
//		FileReader reader = null;
//		2. 보조 읽기(2)
		BufferedReader br = null;

//		reader = new FileReader(fileName);

		br = new BufferedReader(new FileReader(fileName)); // 읽은 리더를 보조에 삽입

		while (true) {
			String str = br.readLine();
			System.out.println(str);

			if (str == null) {
				break;
			}
		}

		System.out.println("End!!");
	}
}
