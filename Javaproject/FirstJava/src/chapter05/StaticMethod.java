package chapter05;

public class StaticMethod {
	static int num1 = 10;// 클래스변수
	int num2;// 인스턴스 변수

	static void staticMethod() {
		System.out.println("staticMethod");
		// System.out.println(num2);//인스턴스 생성없이 사용불가
		// 클래스 멤더에 인스턴스 멤버는 사용이 불가하다
		StaticMethod sm = new StaticMethod();
		sm.instanceMethod();
	}

	void instanceMethod() {
		System.out.println();
		staticMethod();
	}
}
