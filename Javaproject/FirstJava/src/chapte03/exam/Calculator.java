package chapte03.exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		long num1 = 12;
		long num2 = 13;
		addResultPrint(num1, num2);
	}

	public static void addResultPrint(long num1, long num2) {
		System.out.println("두 수의 덧셈 결과 : " + (num1 + num2));
	}

}
