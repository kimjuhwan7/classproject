package chapter05;

public class VariableTest {

	int iv = StaticVariable.cv;// static선언된 다른클래스 변수를 가져왔음
	int iv2;
	static final float PI = 3.14f;
	// 상수 : 변하지 않는 수 => final 키워드를 써준다!!
	// 상수의 식별자는 모두 대문자로 사용

	public static void main(String[] args) {
		// 클래스 변수를 참조할 때는 클래스이름.변수이름
		System.out.println(StaticVariable.cv);
		System.out.println(StaticVariable.PI);
	}
}
