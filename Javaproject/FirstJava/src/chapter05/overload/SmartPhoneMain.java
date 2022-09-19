package chapter05.overload;

public class SmartPhoneMain {
	public static void main(String[] args) {
		// SmartPhone 인스턴스 생성
		SmartPhone sp1 = new SmartPhone("RED", 4.7f, "삼성", 5);
		// 매개변수 순서가 다르면 오류가 남
		sp1.showInfo();

		SmartPhone sp2 = new SmartPhone("Gold", 5f, "애플", 10);
		// 매개변수 순서가 다르면 오류가 남
		sp2.showInfo();

		SmartPhone sp3 = new SmartPhone();

		SmartPhone sp4 = new SmartPhone("APPLE", 50f);
		sp4.showInfo();
		
		SmartPhone sp5 = new SmartPhone("Samsung");
		sp5.showInfo();
	}
}
