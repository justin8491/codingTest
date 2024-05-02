package kr.co.dong.array;

public class ArrayTest_test {

	public static void main(String[] args) {
		String str = 
				"ENFP,INFJ,ESTP,ISTP,ISTJ,ESFJ,ISFP,INTP,INFP,ISTP,ISFP,ENFP,ISTJ,ISFJ,INFP,INTJ,ENFP,ESTP,ENFJ,ISFP";
		
		String[] mbti = str.toString().split(",");
		
		
		for(int i=0;i<mbti.length;i++) {
			System.out.println(mbti[i]);
		}
	}

}
