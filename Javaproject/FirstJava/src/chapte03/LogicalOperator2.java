package chapte03;

public class LogicalOperator2 {
	public static void main(String[] args) {

		int age = 19;

		if (age <= 19 && age >= 13) {
			System.out.println("나이는 " + age + "세 청소년 입니다.");
		} else {
			System.out.println("나이는 " + age + "세 성인 입니다.");
		}

		System.out.println('a' < 'b');
		// 해당 문자가 소문자 인지 판별
		char c = '6';
		// 소문자 판별
		boolean chk2 = c >= 'a' && c <= 'z';
		// 대문자 판별
		boolean chk3 = c >= 'A' && c <= 'Z';
		// 숫자 판별
		boolean chk4 = c >= '0' && c <= '9';

		boolean result = c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
		System.out.println(result == true);
		if (chk2) {
			System.out.println(c + "은 소문자 입니다.");
		} else if (chk3) {
			System.out.println(c + "은 대문자 입니다.");
		} else if (chk4) {
			System.out.println(c + "은 숫자 입니다.");
		} else {
			System.out.println(c + "은 소문자, 대문자, 숫자가 아닙니다.");
		}
		// 대문자 또는 소문자 또는 숫자 만 사용
		// 대문자 판별||소문자 판별||숫자 판별
		char num52 = 'ㄱ';
		System.out.println(num52 + 0);
	}
}
