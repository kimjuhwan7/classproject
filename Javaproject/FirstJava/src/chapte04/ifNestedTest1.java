package chapte04;

public class ifNestedTest1 {
	public static void main(String[] args) {
		int num = 10;
		if (num > 0) {
			System.out.println("num은 양의 정수입니다.");
		} else {
			if (num < 0) {
				System.out.println("num은 음의 정수입니다.");
			} else {
				System.out.println("num은 0입니다.");
			}
//else 안에 if문을 넣었다.
		}
	}
}
