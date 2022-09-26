package chapter08;

public class IPhone extends Phone {
	public IPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	void turnOn() {
		System.out.println("아이폰의 전원을 켭니다.");
		power = true;
	}
}
