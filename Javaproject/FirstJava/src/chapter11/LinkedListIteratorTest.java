package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteratorTest {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);

		// Iterator를 이용한 일괄 처린
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer integer = itr.next();
			System.out.println(integer);
		}
	}

	static <N> void printAll(LinkedList<N> list) {
		for (N obj : list) {
			System.out.println(obj);
		}
	}
}
