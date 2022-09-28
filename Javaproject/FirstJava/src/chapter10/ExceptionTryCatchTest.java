package chapter10;

import java.util.Scanner;

public class ExceptionTryCatchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1을 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("숫자 2을 입력하세요");
		int num2 = sc.nextInt();
		try {
			System.out.println("num1 / num2 = " + num1 / num2);
			String str = null;

//			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가능합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		} catch (NullPointerException e) {
			System.out.println("null!!!");
			e.printStackTrace();
		} finally {
			//return
			System.out.println("프로그램을 종료합니다.");
		}

	}
}
