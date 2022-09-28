package chapter09.exam;

//위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 
public class Person {
	String name = "10";
	String personNumber;

	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	public String userNum(String userNum) {
		if (name.equals(userNum)) {
			System.out.println("주민번호가 같습니다.");
		} else {
			System.out.println("주민번호가 같지 않습니다.");
		}
		return userNum;

	}

}
