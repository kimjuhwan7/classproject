package chapte04;

public class SwitchCaseTest1 {
	public static void main(String[] args) {
		int score = 93;

		switch (score / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
			break;
		}
		// score를 10으로 나눠 부합되는 case에 들어간 뒤 실행 후 break로 나온다
		System.out.println(score / 10);
	}
}
