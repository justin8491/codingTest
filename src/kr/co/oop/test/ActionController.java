package kr.co.oop.test;

public class ActionController extends Food {

	public static void main(String[] args) {
		Fruit fruit = new Fruit("apple", 10000);
		String food = fruit.getFoodName();

//		fruit.eat(fruit.cookFood("사과"));
		fruit.eat(food);
		fruit.cutAndEat(food);
		fruit.cookFood(food);
//		fruit.foodPrice(food);
	}

}
