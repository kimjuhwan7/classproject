package chapter11;

import java.util.HashSet;
import java.util.TreeSet;

import javax.sound.midi.Track;

import chapter08.phone.Phone;

public class SmartPhoneTreeSetTest {
	public static void main(String[] args) {

		TreeSet<SmartPhone> set = new TreeSet<>();
		set.add(new SmartPhone("JAVA", "010-0000-0000"));
		set.add(new SmartPhone("SON", "010-4314-3333"));
		set.add(new SmartPhone("Spring", "010-8764-0000"));
		set.add(new SmartPhone("King", "010-6544-0000"));
		set.add(new SmartPhone("Scott", "010-1111-1111"));
		set.add(new SmartPhone("Adam", "010-4564-3333"));

		System.out.println("요소의 개수 : " + set.size() + "개 입니다.");

		for (SmartPhone sp : set) {
			System.out.println(sp);
		}

	}
}
