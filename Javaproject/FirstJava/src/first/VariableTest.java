package first;

public class VariableTest {

	static long add(long n1, long n2) {
		long sum = n1 + n2;
		return sum;

	}

	public static void main(String[] args) {
		/*
		 * 변수 : 데이터를 저장할 메모리 공간 생성 테이터를 저장할 메모리 공간 생성 ,메모리에 찾아갈 수 있는 주소 열활
		 *
		 * 변수선언 데이터의 자료형 : 어떤 타입 (숫자, 문자, 논리값), 저장 가능한 사이즈 별로 분리 해놓은 것 선언 : 방법 자료형
		 * 식별자(이름);
		 */

		// int age; // 정수 값을 저장하는 변수 선언

		// age = 10;
		// System.out.println(age);

		System.out.println(add(10, 20));

	}

}
