package chapter02;

public class ValiableTest {
	// 클래스의 시작
	public static void main(String[] args) {

		// 자료형 변수이름 = 데이터;
		int num = 1000;
		// 숫자 1000을 저장하기 위한메모리 공간 생성, 저장공간을 찾아갈 수 있는 주소
		// 변수 선언과 초기화

		// 숫자
		// -정수 :byte, short, int, long
		// -실수 :float, double
		// 문자 : char
		// 논리값 : boolean
		// 문자열(참조형) :String

		int num1 = 100;// 자료형의 기본값 자바 연산시 int을 사용하여 연산함
		byte num2 = 100;
		short num3 = 100; // 사용거의 안함
		long num4 = 100;

		float num5 = 0.5f; // 0.5 ->리터럴 소수점뒤에 f안적으면 double로 저장함
		double num6 = 0.5;

		boolean check = true;// true, false
		boolean check2 = false;// true, false

		String str = "String";
		System.out.println(check + str);
	}

}
