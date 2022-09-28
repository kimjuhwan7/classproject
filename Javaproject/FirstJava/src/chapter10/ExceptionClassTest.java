package chapter10;

import java.util.Stack;

public class ExceptionClassTest {
	public static void main(String[] args) {
		try {
			Class cl = Class.forName("Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int num = 10 / 0;
		} catch (ArithmeticException e) {
//			System.out.println(e);
		}

		int[] arr = new int[3];
		try {
			arr[3] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			String[] names = new String[-1];
		} catch (NegativeArraySizeException e) {
			// TODO: handle exception
		}
		String str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}
}
