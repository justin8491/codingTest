package kr.co.dong.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberTest01 {
	public static void main(String[] args) {

		LineNumberReader reader = null;

		try {
			reader = new LineNumberReader(new FileReader("poem.txt"));

			while (true) {
				String str = reader.readLine();
				if (str == null)
					break;
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo + " : " + str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
			}
		}
	}
}
