package chapter05;

public class StaticVariable {
	static int cv; // static을 붙여줌으로 메모리에 할당
	int iv;
	static final float PI = 3.14f;

	public static void main(String[] args) {
		System.out.println(cv);
	//	System.out.println(iv);
	}
}
