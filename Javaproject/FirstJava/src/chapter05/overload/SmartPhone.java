package chapter05.overload;

// 클래스는 인스턴스를 생성하기 위한 설계도 역활을 한다.
// 클래스에서 정의한 변수, 메소드는 바로 사용이 불가하다!!
// 클래스로 인스턴스를 만들어서 사용한다!!!!!!!
// class 정의는 class 키워드를 사용해서 정의한다!
public class SmartPhone {

	// 스마트폰 인스턴스를 만들기 위한 설계도 역활을 한다. (메인이 없어서 실행되지 않음)

	// 클래스는 변수와 메소드로 구성한다.
	// 생성자 : 필수이지만 생략 가능하다.

	// 클래스의 멤버 : 변수, 메소드
	// 클래스 내부에 정의된 변수 : 멤버 변수, 인스턴스 변수
	// 클래스 내부에 정의된 메소드 : 멤버 메소드, 인스턴스 메소드
	// 스마트폰의 속성 : 컬러, 사이즈, 제조사, 볼륨 사이즈
	// 속성 => 변수
	String color;// 파란색 변수이름이면 인스턴스 변수, 초기화 생략 가능=> 인스턴스 생성시에 초기값으로 할당해준다.
	float size;
	String company;
	int volumeSize;

	// 생성자 : 인스턴스 생성시에 단 한번 실행하는 초기화 메소드
	// 클래스이름 (매개변수...){
	// 초기화 코드
	// }

	SmartPhone() {
		// 매개변수 없고, 처리 내용이 없는 생성자 => 기본생성, 생략가능
		//아무것도 정의해주지 않았을 때 생성해준다. 
	}

	// 생성자의 오버로딩 : 같은 이름의 생성자 정의
	SmartPhone(String color, float size, String company, int volumeSize) {
		// 인스턴스를 생성하면 this 참조변수도 생성
		// this 는 현재 인스턴스 자신의 주소값을 가진
		// SmartPhone 클래스에서 생성한 color를 가져올때는 this.color로 사용한다
		this.color = color;
		this.size = size;
		this.company = company;
		this.volumeSize = volumeSize;
	}

	SmartPhone(String company, float size) {
//		this.company = company;
//		this.size = size;
//		this.color = "black";
//		this.volumeSize = 10;
		this("black", size, company, 10);
	}

	SmartPhone(String company) {
//		this.company = company;
//		this.size = 4f;
//		this.color = "black";
//		this.volumeSize = 10;
		this("black", 4f, company, 10);
	}

	// 전화걸기
	void call() {
		System.out.println("전화 걸기");
	}

	// 볼륨 키우기
	void volumeUp() {// volumeSize 변수에 값을 1 올려줌
		System.out.println("볼륨을 키웁니다.");
		volumeSize++;// 같은
		// 클래스에 있어서 변수에 바로 접근하여 변경할 수 있다.
	}

	// 볼륨 낮추기
	void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volumeSize--;
	}

	void showInfo() {
		String color = "";
		System.out.println("폰정보");
		System.out.println("제조사 : " + company);
		System.out.println("색상 : " + this.color); // 인스턴스의 멤버를 가르키는 키워드this
		System.out.println("사이즈 : " + size);
		System.out.println("볼륨 크기 : " + volumeSize);
	}

}// public 이 없으면 같은 클래스에서만 사용 가능하다.
