package chapte04;

public class SwitchCaseTest2 {
	public static void main(String[] args) {
		int score = 100;

		switch (score / 10) {
		case 10:
			System.out.println("A");
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B");
		default:
			System.out.println("C");
			// case에 brick를 걸어주지 않아서 다음case도 실행된다
		}
	}
}
