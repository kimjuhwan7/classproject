package chapter06;

import java.util.Iterator;

public class ArrayTest5 {
	public static void main(String[] args) {

		int[] numbers = { 2, 6, 5, 32, 65, 12 };

		for (int num : numbers) {
			System.out.print(num + "\t");
		}
		System.out.println();
		System.out.println();
		int[][] scores = { { 100, 90, 60 }, { 40, 100, 90 }, { 100, 90, 60 }, { 100, 90, 60 }, { 100, 90, 60 },
				{ 100, 90, 60 } };

		for (int[] temp : scores) {
			for (int num : temp) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}
