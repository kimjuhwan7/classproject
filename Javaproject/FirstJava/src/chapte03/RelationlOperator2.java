package chapte03;

public class RelationlOperator2 {
	public static void main(String[] args) {
		// 관계연산자(비교연산자)
		// > < >= <= == !=
		// >왼쪽 값이 더 크다
		// <오른쪽 값이 더 크다
		// >= 왼쪽 값이 크거나 같다
		// <= 오른쪽 값이 크거나 같다
		// == 양쪽 값이 같다
		// != 양쪽 값이 다르다
		
		// String으로 변수 만들면 "JAVA"문자열을 메모리공간에 넣고
		// 주소값만 str1에 넣어준다
		// (str1에는 큰 따움표(" ") 안에 있는 문자열에 주소를 가르킨다)

		String str1 = "JAVA";
		String str2 = "HTML";
		String str3 = "JAVA";

		System.out.println(str1 == str2);// 주소값 == 주소값
		System.out.println(str1 != str2);// 주소값 != 주소값
//		System.out.println(str1 > str2);주소값 끼리는 비교할 수 없다
		System.out.println("str1 == str3 => " + (str1 == str3));
		// 비교연산자가 우선순위에 밀려 문자열 + 주소값이 된다
		// 해결방법 str1 == str3을 (str1 == str3)로 우선순위를 높혀준다
	}
}
