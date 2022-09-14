package chapter02;

public class ValiableIntegerTest {

	public static void main(String[] args) {
		// 정수
		// byte short int(기본타입) log
		// 1byte 2byte 4byte 8byte
		int num = 100;
		byte byteNum1 = 10;
		byte byteNum2 = 127;
		byte byteNum3 = (byte) 2000014500;
		System.out.println(byteNum1);
		System.out.println(byteNum2);
		System.out.println(byteNum3);

		long longNum1 = (long) 2147000000004455787L;
		int num1 = 100000;
		int num2 = 100000;
		long result = (long) num1 * num2;// long * long
		System.out.println(result);

	}

}
