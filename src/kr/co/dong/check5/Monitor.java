package kr.co.dong.check5;

public class Monitor {

//	모니터의 총 판매량 : 클래스 변수(필드)
//	인스턴스의 공통 속성인 경우 설정함.
	static int count = 0;

	private String name;
	String color;
	String price;
	String resol;
	boolean onOff;

	public Monitor() {
		System.out.println("모니터 뿅!! ");
		this.count += 1;
	}

	// 모니터 명 색상 가격만 생성 하도록
	public Monitor(String name, String color, String price) {
		this.name = name;
		this.color = color;
		this.price = price;

		this.count += 1;
	}

	// 모니터명 색상 해상도 => 만들 수 없음
//	public Monitor(String color, int price, String resol) {
//		this.color = color;
//		this.price = price;
//		this.resol = resol;
//	}

	void powerOn() {
		System.out.println("전원을 켭니다. ");
		this.onOff = true;
	}

	void powerOff() {
		System.out.println("전원을 끕니다. ");
		this.onOff = false;
	}

//	getter/setter 구현
	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

}
