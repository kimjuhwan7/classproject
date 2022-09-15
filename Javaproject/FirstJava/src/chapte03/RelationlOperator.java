package chapte03;

public class RelationlOperator {
	public static void main(String[] args) {
		// 관계연산자(비교연산자)
		// > < >= <= == !=
		// >왼쪽 값이 더 크다
		// <오른쪽 값이 더 크다
		// >= 왼쪽 값이 크거나 같다
		// <= 오른쪽 값이 크거나 같다
		// == 양쪽 값이 같다
		// != 양쪽 값이 다르다
		int num1 = 30;
		int num2 = 2;
		System.out.println(num1 > num2);// 예상결과 true
		System.out.println(num1 < num2); // 예상결과 felse
		System.out.println(num1 >= num2); // 예상결과 true
		System.out.println(num1 <= num2); // 예상결과 felse
		System.out.println(num1 == num2); // 예상결과 felse
		System.out.println(num1 != num2); // 예상결과 ture

		if (num1 > num2) {
			System.out.println("num1 값이 더 큽니다.");
		} else {
			System.out.println("num2 값이 더 큽니다.");
		}
	}
}
