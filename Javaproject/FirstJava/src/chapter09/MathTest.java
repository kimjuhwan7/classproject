package chapter09;

public class MathTest {
	public static void main(String[] args) {
		// PI
		System.out.println(Math.round(Math.PI));// 3.141592 반올림하여 3으로 출력

		// 난수 생성
		System.out.println(Math.random());
		// 1~45
		int num = (int) (Math.random() * 45) + 1;
		System.out.println(num);
		// 절사
		System.out.println(Math.floor(313.4242));
		// 반올림
		System.out.println(Math.round(123.543151353));
		
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
	}
}
