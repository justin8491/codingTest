package kr.co.control;

public class StringTest {

	public static void main(String[] args) {
//		String str = new String();

		String str = new String("1234567890");
		int age = 2;
		System.out.println(str);

		System.out.println("문자열 길이 :" + str.length());

//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5));
//		System.out.println(str.charAt(6));
//		System.out.println(str.charAt(7));
//		System.out.println(str.charAt(8));
//		System.out.println(str.charAt(9));

		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}
	}

}
