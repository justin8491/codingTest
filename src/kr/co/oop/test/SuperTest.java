package kr.co.oop.test;

public class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 15;
	void method() {
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
	}
}
