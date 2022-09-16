package chapte04;

public class SwitchCaseTest2 {
	public static void main(String[] args) {

		int score = 95;// 시험 점수를 입력받음

		switch (score / 10) {// 입력된 점수를 / 10 함
		case 10, 9:// 값 10, 9 를 걸러줌
			System.out.println("A");
		case 8:// 값 8을 걸러줌
			System.out.println("B");
		case 7:// 값 7을 걸러줌
			System.out.println("C");
		default:// 위에서 걸러지지 않은 값을 걸러줌
			System.out.println("F");
			// case에 brick를 걸어주지 않아서 다음case도 실행된다
		}
	}
}
