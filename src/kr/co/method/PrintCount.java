package kr.co.method;

public class PrintCount {
	void print(char ch, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
	}

	void print(String str, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(str);
		}
	}

	void printGoogoodan(int num) {
		for (int i = 1; i < 9; i++) {
			System.out.println(i * num + ", ");
		}

	}
}
