package chapter07;

public class SmartPhoneMain2 {

	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-1111-1111");
		GooglePhone googlePhone = new GooglePhone("010-2222-2222");

		callByPhoen(androidPhone);
		callByPhoen(iPhone);

	}

	static void callByPhone(Phone phone) {
		// 이 코드가 상위타입 Phone이라서 Phone을 작성하면 다양한 폰들에게 call메소드를 줄 수 있음
		// 메소드의 매개변수
		// Phone phone = andoidPhone;
		phone.call();

	}

	static void callByPhone(GooglePhone phone) {
		phone.call();
	}

	// 안드로이드 폰
	static void callByPhoen(AndroidPhone phone) {
		phone.call();
	}

//같은 이름 오버로딩
	// 아이폰
	static void callByPhoen(IPhone phone) {
		phone.call();
	}

}
