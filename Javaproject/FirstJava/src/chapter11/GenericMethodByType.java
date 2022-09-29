package chapter11;

import chapter08.phone.Phone;
import chapter08.phone.PhoneImpl;

public class GenericMethodByType {

	public <T extends Phone> void hello(T t) {
		System.out.println("안녕하세요. " + t.toString() + "입니다.");
		t.call();
	}

	public static void main(String[] args) {
		GenericMethodByType byType = new GenericMethodByType();
//		byType.hello("손흥민");
//		byType.hello(100);
//		byType.<PhoneImpl>hello(new PhoneImpl());
		byType.hello(new PhoneImpl());
//		byType.hello("스마트폰");
	}
}
