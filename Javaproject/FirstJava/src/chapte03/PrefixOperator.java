package chapte03;

public class PrefixOperator {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = ++num1;// num1 = num1 + 1 -> num2 = num1;

		System.out.println("num1 의 값 : " + num1);// 위에서 +1했기 때문에 6
		System.out.println("num2 의 값 : " + num2);// +1 후 대입 했기때문에 6
		System.out.println("++num1 의 값 : " + ++num1);// 6에 +1을 미리해서 7
		System.out.println("++num1 의 값 : " + num1++);// 1+이니깐 대입 먼저해서 7그 후 +1해서 8
		System.out.println("++num1 의 값 : " + ++num1);// 8에서 +1해서 9

	}
}
