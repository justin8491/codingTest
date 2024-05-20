package kr.co.dong.check5;

public class MonitorTest {
	public static void main(String[] args) {
		// 모니터 생성

//		Monitor m1 = null;
//		m1 = new Monitor();

//		m1.name = "삼성모니터1";
//		m1.color = "빨강";
//		m1.price = "200";
//		m1.resol = "1920";

//		m1 가지고 있는 속성을 출력하자(속성 -> 멤버필드)
//		System.out.println(m1);
//		System.out.println(m1.hashCode());
//		System.out.println(m1.name);
//		System.out.println(m1.getName());
//		System.out.println(m1.color);
//		System.out.println(m1.resol);
//		System.out.println(m1.price);

//		m1.powerOff();
//		System.out.println(m1.onOff);
//		m1.powerOn();
//		System.out.println(m1.onOff);
//		System.out.println("====================");

		// 모니터 클래스의 m2 인스턴스는 속성값을 대입한 후 생성하자
//		=> 인스턴스 필드에 값을 대입 후 출력
//		System.out.println(m2.name);
//		System.out.println(m2.getName());
//		System.out.println(m2.color);
//		System.out.println(m2.price);

		Monitor m1 = new Monitor("현세가싫어한모니터", "빨강", "600");
		Monitor m2 = new Monitor("현세가좋아한모니터", "노랑", "400");
		Monitor m3 = new Monitor("LG모니터", "흰색", "500");

		System.out.println();
//		printMonitor(m1);
//		printMonitor(m2);
//		printMonitor(m3);
//		System.out.println(m3.name);
//		System.out.println(m3.getName());
//		System.out.println(m3.color);
//		System.out.println(m3.price);
//		System.out.println(m3.count);

//		모니터가 생성된 개수를 구하고자 한다. 
//		인스턴스필드로 가지고 있지 않아도 됨 => 클래스 필드로 보관
//		static을 부여 
//		System.out.println("모니터의 판매량 : " + m1.count);
//		System.out.println("모니터의 판매량 : " + m2.count);
//		System.out.println("모니터의 판매량 : " + m3.count);
//		System.out.println("클래스 필드(변수) : " + Monitor.count);

	}

//	인스턴스 출력메소드 만들기 -> 이곳에서만 사용
	static void printMonitor(Monitor m) {
		System.out.println("모니터 명 : " + m.getName());
		System.out.println("모니터 색상 : " + m.color);
		System.out.println("모니터 해상도 : " + m.resol);
		System.out.println("모니터 가격 : " + m.price);
	}
}
