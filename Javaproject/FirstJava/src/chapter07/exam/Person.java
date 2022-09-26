package chapter07.exam;

import java.time.LocalDate;
import java.util.Calendar;

import javax.print.attribute.standard.PrinterInfo;

public class Person {

	// Person 이라는 클래스를 정의해봅시다.
	// 1. 이름을 저장하는 변수,
	// 주민등록번호를 저장하는 변수를 정의해 봅시다.
	// 2. 인사하는 메소드를 정의해봅시다.
	// - 안녕하세요. 저는 000입니다. 00살 입니다. 라는 문자열이 출력하도록 정의합니다.

	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	// 나이를 반환하는 메소드, 주민번호는 멤버변수인 personNumber 값을 이용해서 처리함
	int getAge() {
		int result = 0;
		// 나이를 계산해서 반환하는 연산
		// 001212-1111111
		// 990203-1111111
		// 0123456789... 문자열의 index -> 문자들의 위치값
		// 태어난 년도 2자리

		String tempYear = personNumber.substring(0, 2);// "00", "99"
		String tempGender = personNumber.substring(7, 8);// 1,2,3,4

		// 891111-200000
		// 010203-3000000
		// 1 || 2 => 1900 + 89
		// 3 || 4 => 2000 + 01
		// 나이 구하기 : 올해 년도 - 태어난 년도
		// int curYear = Calendar.getInstance().get(Calendar.YEAR);
		// Date -> LocalDate, LocalDatetime, LocalTime
		int curYear = LocalDate.now().getYear();

		int birtYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);

		if (genderVal == 1 || genderVal == 2) {
			result = curYear - (1900 + birtYear);
		} else if (genderVal == 3 || genderVal == 4) {
			result = curYear - (2000 + birtYear);
		}

		return result;
	}

	void printInfo() {
		System.out.printf("안녕하세요, 저는 %s입니다. %d살 입니다.", this.name, getAge());
	}

	public static void main(String[] args) {
		LocalDate curDate = LocalDate.now();
		System.out.println(curDate);
		System.out.println(curDate.getYear());// 올해 년도 가져옴

		int curYear = LocalDate.now().getYear();
		Person p = new Person("son", "" + "001111-300000");
		p.printInfo();
	}
}
