package chapter08.test;

public interface Phone {// 인터페이스
	// 인터페이스 : 멤버 메소드가 모두 추상 메소드, 변수는 모두 상수
	// 인터페이스 => 추상클래스!! , 클래스의상속과 동일한 처리가 가능
	// 오버라이딩, 다형성

	int NUM = 10;// public static final int NUM = 10; 와 동일하다
	void print();// public abstract 생량
}
