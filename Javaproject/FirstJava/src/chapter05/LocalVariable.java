package chapter05;

import java.util.Iterator;

public class LocalVariable {// 클래스

	void method(int num) {
		// 매개변수도 지역변수다 메인에서 실행될때 LocalVariable lv = new LocalVariable();

		int lv = 10;// 메소드 내부에서 선언되는 변수도 지역변수

		if (num > 10) {
			boolean check = true;// check는 지역변수임
		} else {
			boolean check = false; // if와 else는 한번에 실행되지 않으니 check로 같은 이름을 사용해도 정상작동된다
		}

		for (int i = 0; i < 10; i++) {
			// i는 for 블럭안에서만 사용가능한 지역변수이다.
		}
		// System.out.println(i);
		while (lv < 0) {
			int lv2 = 0;
			System.out.println(num++);
		}
		System.out.println(num++);
	}

	public static void main(String[] args) {

		LocalVariable lv = new LocalVariable();
		lv.method(0); // 실행되면 메모리에 lv가 만들어지고 method에 들어가면 매개변수 int num이 만들어 진다
	}
}
