package kr.co.dong.array;

public class Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "������", "������", "������" };

		// for
		for (int i = 0; i < name.length; i++) {
			String str;
			str = name[i];
			System.out.println(str);
		}

		// ��� for
		for (String str : name) {
			System.out.println(str);
		}

		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		
		String result = "";
		
		for(int i = 0;i<source.length();i++) {
			result+=morse[source.charAt(i)-'A'];
		}
		
		System.out.println("source : " + source);
		System.out.println("morse : " + result);
	}

}
