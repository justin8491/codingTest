package kr.co.oop.test;

public class Fruit extends Food {

	private String foodName;
	private int foodPrice;

	public Fruit() {
	}

	public Fruit(String foodName, int foodPrice) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "Fruit [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void foodPrice(String food) {

	}

}
