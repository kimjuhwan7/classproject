package chapter05.modifier;

public class PrivateTest {
	private String name;
	private int age;

	public PrivateTest() {
		this.name = "손흥민";
		this.age = 23;
	}

	public void shoInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}
