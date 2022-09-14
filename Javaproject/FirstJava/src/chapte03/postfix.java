package chapte03;

public class postfix {
	public static void main(String[] args) {
		int num1 = 5;
		System.out.println("num1 : " + num1);
		int num2 = num1++; // num2에 대입 먼저 하고 num1은 +1올림
		System.out.println("num1 : " + num1);// 대입 후 +1되어서 6
		System.out.println("num2 : " + num2);// 대입이 먼저 되어서 5값을 받음

		System.out.println("num1 : " + num1++);// 라인이 끝나면 num1은 6->7로 바뀜

	}
}
