package kr.co.oop;

public class Car {
	private String carName;
	private String color;
	private String tire;
	private int seetCnt;

	public Car() {
	}

	public Car(String carName, String color, String tire, int seetCnt) {
		super();
		this.carName = carName;
		this.color = color;
		this.tire = tire;
		this.seetCnt = seetCnt;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}

	public int getSeetCnt() {
		return seetCnt;
	}

	public void setSeetCnt(int seetCnt) {
		this.seetCnt = seetCnt;
	}

	public void run(String carName) {
		System.out.println(carName + "가(이) 달려갑니다.");
	}

	public void stop(String carName) {
		System.out.println(carName + "가(이) 멈춥니다.");
	}
}
