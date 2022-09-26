package chapter07.exam;

public class PersonMain {
	public static void main(String[] args) {

		Male m = new Male("Son", "971122-1111111", "sonny");
		Female f = new Female("King", "001223-3000000", "체육", 3);

		m.printInfo();
		System.out.println();
		f.printInfo();
		System.out.println();
		System.out.println();
		f.printSchoolInfo();

		Person p1 = m;
		Person p2 = f;

		// p1.hi();// hi() 는 Person 클래스의 멤버가 아니기 때문에 호출이 불가
		System.out.println("------------------------");
		p2.printInfo();
	}
}
