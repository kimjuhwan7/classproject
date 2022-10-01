package chapter11;

import java.util.HashSet;
import java.util.Set;

public class SmartPhoneSetTest {
	public static void main(String[] args) {

		Set<SmartPhone> set = new HashSet<>();
		set.add(new SmartPhone("test1", "010-0000-0000"));
		set.add(new SmartPhone("test2", "010-3333-3333"));
		set.add(new SmartPhone("test1", "010-0000-0000"));
		set.add(new SmartPhone("test4", "010-0000-0000"));
		set.add(new SmartPhone("test5", "010-1111-1111"));
		set.add(new SmartPhone("test6", "010-3333-3333"));

		System.out.println("요소의 개수 : " + set.size() + "개 입니다.");

		for (SmartPhone sp : set) {
			System.out.println(sp);
		}

	}
}
