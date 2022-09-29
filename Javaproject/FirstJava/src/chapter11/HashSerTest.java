package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSerTest {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		set.add("손흥민");
		set.add("김주환");
		set.add("이강인");
		set.add("김주환");

		System.out.println("저장된 요소의 개수 : " + set.size());

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
