package chapter08;

public class OuterClass1 {

	public OuterClass1() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}

	static class NestedClass {
		public void simpleMethod() {
			System.out.println("NestedClass Instance");
		}
	}

	public static void main(String[] args) {
		OuterClass1.NestedClass nst1 = new OuterClass1.NestedClass();

		OuterClass1 o = new OuterClass1();
	}
}
