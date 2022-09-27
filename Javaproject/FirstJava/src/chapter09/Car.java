package chapter09;

public class Car extends Object {

	String name;

	Car(String name) {
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Car) {
			Car car = (Car) obj;
			result = this.name.equals(car.name);

		}

		return result;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

	public static void main(String[] args) {
		Car car1 = new Car("BMW");
		Car car2 = new Car("BMW");

		System.out.println(car1);// 클래스의 풀네임 @해시코드16진수
//		System.out.println(car1.hashCode());
		System.out.println(car2);

		System.out.println("car1 == car2 => " + (car1 == car2));
		System.out.println("car1.equals(car2) " + car1.equals(car2));

		if (car1.equals(car2)) {
			System.out.println("같은 차종 입니다.");
		} else {
			System.out.println("서로다른 차종입니다.");
		}
	}
}
