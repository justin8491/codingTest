package kr.co.control;

import java.lang.reflect.*;

public class Person {

	int age;

	public Person() {
		this.age = 27;
	}

	public Person(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) throws Exception {

		Class clazz = Class.class.forName("kr.co.control.Person");
		System.out.println("Class name : " + clazz.getName());
//		Method[] methods = clazz.getDeclaredMethods();

	}
}
