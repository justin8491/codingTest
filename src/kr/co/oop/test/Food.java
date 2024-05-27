package kr.co.oop.test;

public class Food implements Action {

	public void cutAndEat(String food) {
		System.out.println(food + "(을)를 잘라 먹는다.");
	}

	@Override
	public void eat(Object object) {
		System.out.println(object + "(을)를 먹는다.");

	}

	@Override
	public void cookFood(String food) {
		System.out.println(food + "(을)를 요리해 먹는다.");
	}

}
