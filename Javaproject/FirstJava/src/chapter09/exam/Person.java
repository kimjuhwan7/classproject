package chapter09.exam;

//위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 
public class Person {
	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

//	@Override
//	public String equals(String userName1, String userNum1) {
//		if (userName1,userName1.equals(userName1,personNumber)) {
//			return "주민번호가 동일합니다.";
//
//		} else {
//			return "주민번호가 틀립니다.";
//		}
//
//	}

}
