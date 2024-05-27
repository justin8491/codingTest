package kr.co.oop.test;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
	}

}

class Point {
	int x = 10, y = 20;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point {
	int z = 30;

	Point3D() {
		this(100, 200, 300);
	}

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	String getLocation() {
		// TODO Auto-generated method stub
		return super.getLocation() + ", z : " + z;
	}

}
