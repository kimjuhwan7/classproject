package chapter06;

import java.util.Iterator;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] score1 = { 100, 90, 70, 80, 65 };
		System.out.println("score1 요소의 개수 : " + score1.length);
		System.out.println("배열 score1의 요소 출력");
		for (int i = 0; i < score1.length; i++) {
			System.out.println(score1[i]);
		}

		System.out.println();

		int[] score2 = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("score2 요소의 개수 : " + score2.length);

		System.out.println("배열 score2의 요소 출력");
		for (int i = 0; i < score2.length; i++) {
			System.out.println(score2[i]);
		}
		System.out.println();
		// 6 5 4 3 2 1
		System.out.println("배열 score3 ======");
		for (int i = score2.length - 1; i >= 0; i--) {
			System.out.println(score2[i] + ", ");

		}

		int[] score3;
		score3 = new int[] { 100, 90, 70, 80, 65 };
	}
}
