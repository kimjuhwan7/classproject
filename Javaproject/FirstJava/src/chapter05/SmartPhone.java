package chapter05;

// 클래스는 인스턴스를 생성하기 위한 설계도 역활을 한다.
// 클래스에서 정의한 변수, 메소드는 바로 사용이 불가하다!!
// 클래스로 인스턴스를 만들어서 사용한다!!!!!!!
// class 정의는 class 키워드를 사용해서 정의한다!
public class SmartPhone {
	
	//스마트폰 인스턴스를 만들기 위한 설계도 역활을 한다. (메인이 없어서 실행되지 않음)
	
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

	// 전화걸기
	void call() {
		System.out.println("전화 걸기");
	}

	// 볼륨 키우기
	void volumeUp() {// volumeSize 변수에 값을 1 올려줌
		System.out.println("볼륨을 키웁니다.");
		volumeSize++;// 같은
		//클래스에 있어서 변수에 바로 접근하여 변경할 수 있다.
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
		System.out.println("색상 : " + this.color); //인스턴스의 멤버를 가르키는 키워드this
		System.out.println("사이즈 : " + size);
		System.out.println("볼륨 크기 : " + volumeSize);
	}


	

}// public 이 없으면 같은 클래스에서만 사용 가능하다.
