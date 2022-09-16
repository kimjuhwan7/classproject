package chapte04.exam;

public class Exam04 {
	public static void main(String[] args) {
		// 문제 4.
		// 다음 식을 만족하는 조합을 찾는 프로그램 작성.
		// A B
		// B A +
		// ----------
		// 9 9
		// A와 B 값의 조합들을 찾아보자
		// 11A + 11B = 99 => A+B=9
		// 각각의 자리수 : 0~9
		for (int i = 0; i < 10; i++) {
			System.out.println("A: "+i+" 일때, B :"+(9-i));
		}
	}
}
