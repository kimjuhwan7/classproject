package chapter09;

public class StringTest {
	// 문자열을 다루는 String

	public static void main(String[] args) {
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");

		System.out.println("str1 == str2 => " + (str1 == str2));
		System.out.println("str1 == str3 => " + (str1 == str3));

		System.out.println(str1.equals(str3));

		// 특정 타입의 데이터 -> 문자열 String 타입으로 변경
		String str4 = "" + 1;
		String str5 = String.valueOf(false);
		String str6 = new String();
		System.out.println(str5);
/////////////////////////////////////
		System.out.println("\n------------------\n");
		String str = "Hello~";
		System.out.println(str.toString());

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));

		// 문자열을 역순으로 출력해보자
		System.out.println("문자열 출력 -----------");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("역순 출력-------------");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello!!!"));
		System.out.println(str.compareTo("Hello"));
		// 문자열의 합

		System.out.println(str.concat(str1));// "Hello~"+"String"

		System.out.println();
		// 포함 확인
		System.out.println(str.contains("~"));
		System.out.println(str.contains("bue"));
		// 시작단어 검색
		System.out.println(str.startsWith("He"));
		// 끝단어 검색
		System.out.println(str.endsWith(".pdf"));
		// 확장자 찾기 : *.jpg
		System.out.println();
		// 같은지 비교
		System.out.println(str.equals("top"));
		System.out.println(str.equals("Hello~"));

		System.out.println();
//검색글자 위치 찾기
		System.out.println(str.indexOf("l"));
		// 뒤에서부터 글자 위치 찾기
		System.out.println(str.lastIndexOf("e"));
		// Hello~
		System.out.println(str.indexOf("o~"));

		System.out.println();
		// 글자 길이 가 0이면 true 반환
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		// trim으로 좌우 공백 지워줌
		System.out.println(" ".trim().isEmpty());

		System.out.println(str.length());
		System.out.println(str.length() == 0);

		System.out.println();
		// 문자열 치환
		System.out.println(str.replace("~", "!!!"));
		
		
	}

}
