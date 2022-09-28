package chapter09.exam;

public class PersonT {
	String name;
	String personNumber;

	public PersonT(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

//주민번호가 같으면 같은 인스턴스로 판별하는 프로그램을 만들어봅시다.
	// "000000-0000000"
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		// 매개변수로 전달받은 객체와 비교 : 주민번호
		if (obj != null && obj instanceof PersonT) {
			// Object -> Person
			PersonT personT = (PersonT) obj;
			result = this.personNumber.equals(personT.personNumber);
		}
		return result;
	}

	public static void main(String[] args) {
		PersonT p1 = new PersonT("김주환", "000000-0000000");
		PersonT p2 = new PersonT("Park", "000000-0000000");
		PersonT p3 = new PersonT("SON", "000000-7777777");

		System.out.println("p1과 p2는 같은 사람인가? => " +p1.equals(p2));
		System.out.println("p1과 p2는 같은 사람인가? => " +p1.equals(p3));
	}

}
