package chapte04;

public class SwitchCaseTest3 {
	public static void main(String[] args) {
		int score = 70;

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
		// 모든 case 조건에 부합하지 않아 그래도 switch문을 빠져나온다
		}
	}
}
