package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		printAll(list);
	}

	static <N> void printAll(LinkedList<N> list) {
		for (N obj : list) {
			System.out.println(obj);
		}
	}
}
