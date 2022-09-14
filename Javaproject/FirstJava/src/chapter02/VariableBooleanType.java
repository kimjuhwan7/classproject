package chapter02;

public class VariableBooleanType {

	public static void main(String[] args) {

		// 논리값 : true, false 값을 가지는 변수 타입 => boolean
		boolean bool1 = false;
		boolean bool2 = true;

		if (bool1) {
			// 참일때 실행 코드
			System.out.println("참 입니다.");
		} else {
			// 거짓일 때 실행 코드
			System.out.println("거짓 입니다.");
		}
		System.out.println(bool1);
		System.out.println(bool2);
		char a = 'y';
		System.out.println((int) a);
	}

}
