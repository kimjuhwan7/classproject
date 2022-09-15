package chapte03;

import java.util.Scanner;

public class Calculator {
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 값과 두번째 값을 입력하세요");

			System.out.print("첫번째 값 \t");
			int num1 = sc.nextInt();
			System.out.print("두번째 값 \t");
			int num2 = sc.nextInt();
			System.out.println();
			System.out.println("두 수의 합" + sum(num1, num2));
			System.out.println("두 수의 차" + minus(num1, num2));
			System.out.println("두 수의 곱 " + multiply(num1, num2));
			System.out.println("두 수의 / " + divide(num1, num2));
			System.out.println();
			System.out.print("원에 반지름을 입력해 주세요 : ");
			double num3 = sc.nextDouble();
			System.out.println("반지름의 둘레 " + round(num3));
			System.out.print("원에 넓이를 입력해 주세요 : ");
			num3 = sc.nextDouble();
			System.out.println("반지름의 넓이 " + area(num3));
			System.out.println("");
		}

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

	public static double round(double num3) {
		// 둘레
		double result = num3 * 2 * 3.14;
		return result;
	}

	public static double area(double num3) {
		// 넓이
		double result = num3 * num3 * 3.14;
		return result;
	}
}
