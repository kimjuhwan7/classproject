package chapter05;

public class SmartPhoneMain2 {
	// 인스턴스는 생성할때마다 개별(독립)적인 메모리 공간이 생성된다.
	// 클래스 내부에서 정의한 변수들도 인스턴스 생성과 동시에 생성이 된다.
	// 참조변수는 주소값만 가지는 것이다!!
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();

		// 참조변수의 주소값 비교
		System.out.println("sp1 주소 == sp2 주소 : " + (sp2 == sp1));

		sp1.showInfo();
		sp2.showInfo();
		///////////////////////////////////////

		// 각 인스턴스의 속성값 적용!
		sp1.company = "APPLE";
		sp1.color = "SILVER";
		sp1.size = 5.9f;
		sp1.volumeUp();
		sp1.volumeUp();

		sp2.company = "Samsung";
		sp2.color = "white";
		sp2.size = 4.7f;
		sp2.volumeUp();
		sp2.volumeUp();
		sp2.volumeUp();
		sp2.volumeUp();

		System.out.println("각 인스턴스 설정 후 데이터 출력");
		sp1.showInfo();
		sp2.showInfo();

		sp2 = sp1;

		sp1.showInfo();
		sp2.showInfo();
		sp1.color = "green";
		sp2.showInfo();
		sp1.showInfo();// SmartPhone 인스턴스를 가르키는 주소값 전달해주어야 한다!!!

		showPhoneInfo(sp1);
	}

	public static void showPhoneInfo(SmartPhone sp) {
		System.out.println("매개변수를 참조변수로 정의해서 메소드 내부에서 객체참조");
		//SmartPhone sp = 0x100;
		sp.showInfo();
	}
}
