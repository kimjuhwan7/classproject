package chapter05.modifier.main;

import chapter05.modifier.DefaultTest;

public class DefaultTestMain {
	public static void main(String[] args) {
		DefaultTest dt = new DefaultTest();
		// dt.age = 30;// 다른 패키지에서 볼 수 없다.
	}
}
