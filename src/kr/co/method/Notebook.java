package kr.co.method;

public class Notebook {
	private String name;
	private int price;

	public Notebook() {
	}

	public Notebook(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void printNotebook(String name, int price) {
		System.out.println("��Ʈ�� �̸��� : " + name + " �̰� ������ '" + price + "' �Դϴ�.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	

}
