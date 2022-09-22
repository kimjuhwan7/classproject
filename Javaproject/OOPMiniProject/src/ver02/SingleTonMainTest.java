package ver02;

public class SingleTonMainTest {
	public static void main(String[] args) {
		SingleTonTest st = SingleTonTest.getInstance();
		System.out.println(st);
	}
}
