package ver02;

public class SingleTonTest {

	static SingleTonTest in;

	private SingleTonTest() {
		System.out.println("김주환");
		
	}

	public static SingleTonTest getInstance() {

		return in;
	}
}
