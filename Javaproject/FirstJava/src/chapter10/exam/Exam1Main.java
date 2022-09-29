package chapter10.exam;

import java.util.regex.Pattern;

public class Exam1Main {

	public static void main(String[] args) {

		String str = "abc124@";
		boolean chk1 = Pattern.matches("^[a-z0-9A-Z가-힣]*$", str);
		System.out.println(chk1);

		try {
			if (!chk1) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("소문자, 대문자, 숫자 입력만 가능합니다.ㄴ");
		}
		// 숫자만 -> ^[0-9]*$
		// 영문자만 -> ^[a-zA-Z]*$
		// 한글만 -> ^[가-힣]*$
		// 영어+숫자 -> ^[a-zA-Z0-9]*$
		// 이메일 : ^[a-zA-Z0-9]+@+[a-zA-Z0-9]\.+[a-zA-Z]+$ -> qqq@naver.com
		// 핸드폰 번호 : ^\d{2,3}-\d{4}-\d{4}$
		// 정규식

		// ? : 앞의 문자가 하나이거나 없거나
		// | : or
		// . : 임의에 하나 문자
		// \w : 알파벳 + 숫자
		// \d : [0~9]
	}

}
