package chapter09;

public class StringBufferTest {
	public static void main(String[] args) {
		// stringBuffer,String Builder Buffer은 동시작업이 불가하여 다중연산시 원하는값 출력가능
		// 멀티쓰레드 사용시 Buffer 사용, 단일쓰레드 Builder 사용

		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		// 문자열 붙이기
		sb.append("~");
		sb.append(false);
		System.out.println(sb);
		// 특정 문자열 삭제
		System.out.println(sb.delete(0, 1));

		// 특정위치에 문자열 삽입
		System.out.println(sb.insert(6, "~"));
		// 문자 마지막에 true 문자를 넣어줌
		System.out.println(sb.insert(sb.length(), true));
		// 반대로 돌려버림
		System.out.println(sb.reverse());
	}
}
