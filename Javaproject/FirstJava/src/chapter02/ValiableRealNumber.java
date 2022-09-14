package chapter02;

public class ValiableRealNumber {
	public static void main(String[] args) {
		// 실수 타입
		// double, float
		// 8byte 4byte
		// int 4byte, long 8byte

		// double 타입
		double num1 = 0.1; // num1 = double 타입의 데이터
		double num3 = 0.1234567891023456689;

		System.out.println(num1);
		System.out.println(num3);

		// float 타입
		float num = 0.3f;
		float num4 = 0.1234567891023456689f;
		System.out.println(num);
		System.out.println(num4);

		double num5 = 1.1;
		double num6 = 1.3;

		double result = num5 + num6;
		System.out.printf("%.1f", result);

		int num7 = 10;
		System.out.println("\n"+num7);
	}
}
