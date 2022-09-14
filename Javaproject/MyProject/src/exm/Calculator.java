package exm;

public class Calculator {
	public static void main(String[] args) {
		Sum(10, 10);
		Subtract(10, 10);
		Multiply(10, 10);
		Divide(10, 10);
	}

	public static void Sum(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

	private static void Subtract(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
	}

	private static void Multiply(int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
	}

	private static void Divide(int num1, int num2) {
		int result = 0;
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
	}
}