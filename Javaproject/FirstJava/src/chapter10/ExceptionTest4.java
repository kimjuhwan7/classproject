package chapter10;

import java.util.Scanner;

public class ExceptionTest4 {
	public static void main(String[] args) {
		/*
		 * Scanner sc = null; try { sc = new Scanner(System.in); } finally { if (sc !=
		 * null) { sc.close(); }
		 * 
		 * }
		 */

		try (Scanner sc = new Scanner(System.in)) {

		} catch (Exception e) {
			// TODO: handle exception
		} // 자동으로 클로우즈 처리 된다 ??
	}
}
