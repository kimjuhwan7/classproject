package chapte03.exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("숫자 1을 입력해 주세요.>>>");
		int num1 = in.nextInt();

		System.out.println("숫자 2을 입력해 주세요.>>>");
		int num2 = in.nextInt();
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);

	}

	public static double cir(double r) {
		return 2 * 3.13 * r;
	}

	public static void add(long num1, long num2) {
		System.out.println("두 수의 덧셈 결과 : " + (num1 + num2));
	}

	public static void sub(long num1, long num2) {
		System.out.println("두 수의 뺄샘 결과 : " + (num1 - num2));
	}

	public static void mul(long num1, long num2) {
		System.out.println("두 수의 곱셈 결과 : " + (num1 * num2));
	}

	public static void div(long num1, long num2) {
		System.out.println("두 수의 나누셈 결과 : " + (num1 / num2));
	}

}
