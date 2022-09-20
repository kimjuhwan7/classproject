package chapter05;

public class InstanceVariable {
	// 인스턴스 변수는 인스턴스 생성시에 생성해서 인스턴스 소멸할 때 까지의 생명주기
	// 인스턴스 변수는 클래스 멤버들이 참조 가능!
	// 클래스 멤버는 변수, 메소드가 있다.
	int iv;// 인스턴스 변수는 자동 초기화
	int iv2 = iv;

	void InstanceMethod(int num) {
		System.out.println(iv);
		// 참조변수.변수 처럼 사용해야 하는데 같은변수는 참조변수 없이 바로 사용가능
	}

	void InstanceMethod2(int num) {
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.iv);

		iv = null;// 실제 메모리는 삭제되지 않지만 주소값을 잃어버려 사용이 불가능하다.
		System.out.println(iv.iv);
	}

	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.iv);

		iv = null;// 실제 메모리는 삭제되지 않지만 주소값을 잃어버려 사용이 불가능하다.
		System.out.println(iv.iv);

	}
}
