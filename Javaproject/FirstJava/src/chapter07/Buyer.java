package chapter07;

public class Buyer {
	int money;
	int myPoint;

	Buyer(int money) {
		this.money = money;
	}

	void buy(Product p) {
		money = money - p.price;// 내가 가진돈 차감되어야하고
		// 보너스는 증가 해야함
		myPoint += p.point;
		System.out.println(p + "제품을 구매했습니다.");
		// p => p.toString;
	}

	public static void main(String[] args) {
		// 제품 만들기 : TV 인스턴스, computer 인스턴스
		TV tv = new TV(100);
		computer com = new computer(200);
		// 다형성을 이용한 배열
		Product p1 = tv;
		Product p2 = com;
		Product[] products = new Product[5];
		products[0] = new TV(100);
		products[1] = new computer(200);
		products[2] = new computer(200);
		products[3] = new computer(200);
		products[4] = new TV(100);

		System.out.println("판매 상품 리스트");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i] + " 가격 : " + products[i].price);
		}
		System.out.println("---------------");
		// 구매자 생성
		Buyer buyer = new Buyer(1000);

		// 구매 테스트 : tv, com, p1,p2
		buyer.buy(tv);
		buyer.buy(p2);
		buyer.buy(p1);
		buyer.buy(com);
	}

}
