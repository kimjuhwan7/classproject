package chapter10.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2Main {

	public static void main(String[] args) {

		
		// 2. Scanner 클래스로

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. >>>"); // 123456789

		int num = 0;
		try {
			num = sc.nextInt();// <=예외 처리 포인트
			System.out.println("num = " + num);
		} catch (InputMismatchException e) {
			System.out.println("예외발생");
			System.out.println("정상적인 숫자를 입력해주세요.");
		}

	}

}