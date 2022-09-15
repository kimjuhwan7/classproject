package chapte03;

public class AssignmentOperator {
	public static void main(String[] args) {
		int num = 10;

		num += 5;// num(15) = num(10) + 5
		System.out.println(num);
		num -= 3;// num(12) = num(15) - 3
		System.out.println(num);
		num *= 2;// num(24) = num(12) * 2
		System.out.println(num);
		num /= 4;// num(6) = num(24) / 4
		System.out.println(num);
		num %= 4;// num(2) = num(6) /4
		System.out.println(num);

		String str = "안녕하세요.";
		str += " 저는 김주환 입니다.";// 문자는 문자끼리 합침
		str += " 개발자 입니다.";// str 값에 문자열 추가하여 하나로 이어짐
		System.out.println(str);
	}
}
