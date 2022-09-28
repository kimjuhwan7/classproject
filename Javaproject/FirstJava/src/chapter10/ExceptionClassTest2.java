package chapter10;

import java.util.Stack;

public class ExceptionClassTest2 {
	public static void main(String[] args) {
		try {
			Class cl = Class.forName("Test");
			int num = 10 / 0;

			int[] arr = new int[3];
			arr[3] = 10;

			String str = null;
			System.out.println(str.toString());

			String[] names = new String[-1];

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		} catch (NegativeArraySizeException e) {
			// TODO: handle exception
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}
}
