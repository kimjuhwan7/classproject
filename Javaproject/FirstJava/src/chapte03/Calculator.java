package chapte03;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 \t");
		int num1 = sc.nextInt();
		System.out.print("두번째 값 \t");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.println("두 수의 합" + sum(num1, num2));
		System.out.println("두 수의 차" + minus(num1, num2));
		System.out.println("두 수의 곱 " + multiply(num1, num2));
		System.out.println("두 수의 / " + divide(num1, num2));
		System.out.println("반지름의 둘레 " + round(num1));
		System.out.println("반지름의 넓이 " + area(num1));
	}

	public static int sum(int num1, int num2) {
		// 더하기
		int result = num1 + num2;
		return result;
	}

	public static int minus(int num1, int num2) {
		// 빼기
		int result = num1 - num2;
		return result;
	}

	public static int multiply(int num1, int num2) {
		// 곱하기
		int result = num1 * num2;
		return result;
	}

	public static int divide(int num1, int num2) {
		// 나누기
		int result = num1 / num2;
		return result;
	}

	public static double round(int num1) {
		// 둘레
		double result = num1 * 2 * 3.14;
		return result;
	}

	public static double area(int num1) {
		// 넓이
		double result = num1 * num1 * 3.14;
		return result;
	}
}
