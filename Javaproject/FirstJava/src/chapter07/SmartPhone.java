package chapter07;

public class SmartPhone extends Phone {
//Phone에 메소드와  변수가 들어가있음
//하위 클래스 : 상위 클래스 멤버 + 새로운 멤버 정의 
	String model;

	public SmartPhone() {
		super("010-1111-2222");
		this.model = "IOS";
	}

	SmartPhone(String phoneNumber) {
		super(phoneNumber);
		// super()안에 값이 있으면 맞는매개변수 메소드로가고 값이 없으면 디폴드 생성장로 이동
		this.model = "android";
	}

	SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = "android";
	}

	void play() {
		System.out.println("app을 실행합니다.");
	}

	public static void main(String[] args) {

		// SmartPhone sp = new SmartPhone("010-1111-5555");
		SmartPhone sp = new SmartPhone("010-7777-4444", "Google");
		System.out.println(sp.phoneNumber);
		sp.call();
		System.out.println(sp.model);
		sp.play();
	}
}
