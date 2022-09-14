package exm;

public class Calculator2 {

	public static void main(String[] args) {
		System.out.println("10+20=" + add(10, 20));
		System.out.println("100-10=" + substract(100, 10));
		System.out.println("100*100=" + multifly(100, 100));
		System.out.println("10/3=" + divide(10, 3));

	}

	public static long add(long num1, long num2) {
		// long result = num1 + num2;
		// return result;
		// 위 코드를 간결화 시키면 아래 있는 코드처럼 사용
		return num1 + num2;
		// ① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	}

	public static long substract(long num1, long num2) {
		return num1 - num2;
		// ② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	}

	public static long multifly(long num1, long num2) {
		return num1 * num2;
		// ③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
		// ④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.

	}
}
