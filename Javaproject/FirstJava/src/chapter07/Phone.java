package chapter07;

public class Phone {
	// 전화기에 기본속성은
	// 전화번호
	String phoneNumber;

	public Phone() {
		this.phoneNumber = "010-9999-8888";
	}

	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// 전화걸기
	void call() {// 전화거는 메소드
		System.out.println("전화걸기!!");
	}
}
