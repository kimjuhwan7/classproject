package chapter07;

public class Product {
	int price;
	int point;

	public Product(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class TV extends Product {

	public TV(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TV";
	}

}

class computer extends Product {

	public computer(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "computer";
	}

}