package first;

public class MethodTest {
	public static void main(String[] args) {

		// 메소드 : 기능
		// 메소드의 정의
		// 필요한 데이터 유무 : 매개 변수 결정
		// 어떤 연산 : 목적/문제 해결을 위한 코드
		// 반환 데티어 : 메소드 선언부 맨 앞에 데이터 타입 정의, return 키워드로 데이터 반환
		// 데이터 반환이 없는 경우 return 키워드 생략, 반환 타입은 => void
		// 숫자 2개를 전달 받아 덧셈한 결과를 반환하는 메소드를 정의해보자!!?!?!
		// 숫자 2개를 전달 받아 ->매개변수
		// 덧셈한->덧셈 연산
		// 결과를 반환하는 ->return 결과값
		// 메소드를 정의해보자!!?!?!

		// 메소드의 호출
		int sum = add(100, 50);
		System.out.print(sum);
		System.out.print(add(100, 90));

		addResultPrint(50, 60);
		System.out.println("김");
	}

	// 반환 타입
	public static int add(int num1, int num2) {
		// add(100,50); 메소드의 호출
		int sum = 0;// 정수 데이터 변수 선언후 최초데이터 0을 저장=> 변수 초기화
		// 더하기 연산
		sum = num1 + num2;
		// 연산의 결과를 반환
		return sum;
	}

//정수 두개를 전달 받아 합을 출력하는 메소드 정의
	public static void addResultPrint(int num1, int num2) {
		int sum = num1 + num2;

		System.out.println(sum);
	}
}
